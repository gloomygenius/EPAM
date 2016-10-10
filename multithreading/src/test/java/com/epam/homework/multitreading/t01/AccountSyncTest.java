package com.epam.homework.multitreading.t01;

import org.junit.Test;

public class AccountSyncTest {
    AccountSync accountSync = new AccountSync();

    @Test
    public synchronized void loadAccounts() throws Exception {
        String pathToAccountNum = "src/main/resources/accounts.txt";
        String pathToTransactionList = "src/main/resources/transactions.txt";
        accountSync.doTransaction(pathToAccountNum, pathToTransactionList);

    }

}