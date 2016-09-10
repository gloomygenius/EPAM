package com.epam.homework.oop.t04;

public class StationeryBrandSort implements Comparable<StationeryBrandSort>{
    private String brand;
    private double price;

    public StationeryBrandSort(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public int compareTo(StationeryBrandSort stat){
        return brand.compareTo(stat.brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
