package com.epam.homework.multitreading.t01;

import org.junit.Test;

public class AccountSyncTest {
    private AccountSync accountSync = new AccountSync();

    @Test
    public synchronized void loadAccounts() throws Exception {
        String pathToAccountNum = "src/test/resources/accounts.txt";
        String pathToTransactionList = "src/test/resources/transactions.txt";
        accountSync.doTransaction(pathToAccountNum, pathToTransactionList);
        //результаты в консоли
    }
}