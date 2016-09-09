package com.epam.homework.oop.t02;

import com.epam.homework.oop.t03.Stationery;

public class AccountingStationary {
    private int count = 0;
    private Stationery[] stationeries = new Stationery[100]; // 100 - максимальное количество вещей на столе

    public boolean add(Stationery stationery) {
        for (int i=0; i < stationeries.length; i++) {
            if (stationeries[i]==null){
                stationeries[i]=stationery;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index) {
        if ((index>=stationeries.length)||(index<0)) return false;
        if (stationeries[index]==null) return false;
        stationeries[index]=null;
        return true;
    }
}
