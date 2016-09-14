package com.epam.homework.oop.t04;

import com.epam.homework.oop.t03.Stationery;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Stationery>{
    @Override
    public int compare(Stationery obj1, Stationery obj2){
        if (obj1.getPrice()>obj2.getPrice()) return 1;
        if (obj1.getPrice()==obj2.getPrice()) return 0;
        else return -1;
    }
}
