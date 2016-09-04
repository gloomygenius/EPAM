package com.epam.homework.oop.t01;

public class Pen {

    private double price;
    private String trademark;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (null==o) return false;
        if (getClass()!=o.getClass()) return false;
        Pen pen = (Pen) o;
        if (price!=pen.price) return false;
        if (null==trademark) return (null==pen.trademark);
        else if (!trademark.equals(pen.trademark)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        return ((int) price + trademark.length());
    }

    @Override
    public String toString() {
        return ("Price of "+trademark+" pen = "+price);
    }
}