package com.epam.homework.oop.t02;

import com.epam.homework.oop.t03.Drawing;
import com.epam.homework.oop.t03.Stationery;
import com.epam.homework.oop.t03.Writing;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountingStationaryTest {

    private AccountingStationary accountingStationary = new AccountingStationary();
    private Stationery stationary1 = new Writing("Bic",45.0);
    private Stationery stationary2 = new Writing("Parker",135.0);
    private Stationery stationary3 = new Drawing("DALER ROWNEY",123.0);

    @Test
    public void addTest() {
        for (int i=0;i<100;i++) {
            assertTrue(accountingStationary.add(stationary1));
        }
        assertFalse(accountingStationary.add(stationary2));
    }
    @Test
    public void removeTest(){
        accountingStationary.add(stationary1);
        accountingStationary.add(stationary2);
        accountingStationary.add(stationary3);
        assertTrue(accountingStationary.remove(1));
        assertFalse(accountingStationary.remove(1));
        assertFalse(accountingStationary.remove(200));
        assertFalse(accountingStationary.remove(-1));
    }
}