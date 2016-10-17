package com.epam.homework.multitreading.t01;

import java.io.*;
import java.util.*;
import java.util.regex.*;

@SuppressWarnings("WeakerAccess")
public class AccountSync implements Runnable {
    private Map<Integer, Integer> accountsState = new HashMap<>();
    private Queue<Integer[]> transactionsQueue = new ArrayDeque<>();
    private static int transactionCount = 0;
    private ArrayList<Thread> threadPool = new ArrayList<>();

    public void doTransaction(String pathToAccountNum, String pathToTransactionList) {
        AccountSync accountSync = new AccountSync();
        String accountsInfo = accountSync.loadFinInfo(pathToAccountNum);
        String transactionsInfo = accountSync.loadFinInfo(pathToTransactionList);
        accountSync.parseAccounts(accountsInfo);
        accountSync.parseAndStartTransaction(transactionsInfo);

    }

    private void parseAndStartTransaction(String transactionsInfo) {
        Pattern accountPattern = Pattern.compile("(\\d+) (\\d+) (\\d+)");
        Matcher matcher = accountPattern.matcher(transactionsInfo);
        while (matcher.find()) {
            Integer[] tranInfo = new Integer[3];
            tranInfo[0] = Integer.parseInt(matcher.group(1));
            tranInfo[1] = Integer.parseInt(matcher.group(2));
            tranInfo[2] = Integer.parseInt(matcher.group(3));
            transactionsQueue.add(tranInfo);
            Thread thread = new Thread(this);
            threadPool.add(thread);
            thread.start();
        }
        for (Thread thread :
                threadPool) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String loadFinInfo(String path) {
        File file = new File(path);
        String textOfFile = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            char[] buffer = new char[(int) file.length()];
            if (reader.read(buffer) != -1) {
                textOfFile = new String(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textOfFile;
    }

    private void parseAccounts(String textOfFile) {
        Pattern accountPattern = Pattern.compile("(\\d+):(\\d+)");
        Matcher matcher = accountPattern.matcher(textOfFile);
        while (matcher.find()) {
            Integer accountNumber = Integer.parseInt(matcher.group(1));
            Integer balance = Integer.parseInt(matcher.group(2));
            accountsState.put(accountNumber, balance);
        }
    }

    @Override
    public void run() {
        transaction();
    }

    private synchronized void transaction() {
        Integer[] transInfo = transactionsQueue.remove();
        int transactionNumber = ++transactionCount;
        System.out.println("Начало обработки транзакции №" + transactionNumber + ":");
        System.out.println(transInfo[0] + "-->" + transInfo[1] + " сумма:" + transInfo[2]);
        if ((accountsState.get(transInfo[0]) - transInfo[2]) < 0) {
            System.err.println("Недостаточно средств на счёте " + transInfo[0] + " для транзакции " + transactionNumber);
        } else {
            Integer amount = accountsState.get(transInfo[0]) - transInfo[2];
            accountsState.put(transInfo[0], amount);
            amount = accountsState.get(transInfo[1]) + transInfo[2];
            accountsState.put(transInfo[1], amount);
            System.out.println("Транзакция №" + transactionNumber + " успешно проведена");
            printAccountsState();
        }
    }

    private synchronized void printAccountsState() {
        System.out.print("Состояние счёта: ");
        for (Map.Entry<Integer, Integer> entry : accountsState.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
        }
        System.out.println();
    }
}