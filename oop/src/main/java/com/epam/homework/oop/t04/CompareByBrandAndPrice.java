package com.epam.homework.oop.t04;

import com.epam.homework.oop.t03.Stationery;

import java.util.Comparator;

@SuppressWarnings("WeakerAccess")
public class CompareByBrandAndPrice implements Comparator<Stationery> {
    @Override
    public int compare(Stationery obj1, Stationery obj2) {
        String brand1 = obj1.getBrand();
        String brand2 = obj2.getBrand();
        if (brand1.compareTo(brand2) == 0) {
            if (obj1.getPrice() > obj2.getPrice()) return 1;
            if (obj1.getPrice() == obj2.getPrice()) return 0;
            else return -1;
        }
        return brand1.compareTo(brand2);
    }
}
