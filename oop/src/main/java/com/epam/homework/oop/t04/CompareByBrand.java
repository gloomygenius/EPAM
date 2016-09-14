package com.epam.homework.oop.t04;

import com.epam.homework.oop.t03.*;

import java.util.Comparator;

public class CompareByBrand implements Comparator<Stationery> {
    @Override
    public int compare(Stationery obj1, Stationery obj2){
        String brand1=obj1.getBrand();
        String brand2=obj2.getBrand();
        return brand1.compareTo(brand2);
    }
}
