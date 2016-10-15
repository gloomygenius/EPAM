package com.epam.homework.oop.t01;

/**
 * Класс "Ручка".
 *
 * @author Василий Бобков
 * @version 1.0
 */

@SuppressWarnings("WeakerAccess")
public class Pen {

    private double price;
    private String trademark;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    /**
     * Переопределённый метод equals().
     *
     * @param o Сравниваемый объект
     * @return true если совпадает, иначе false
     */
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

    /**
     * Переопределённый метод hashCode().
     *
     * @return возвращает хэш код
     */
    @Override
    public int hashCode(){
        return ((int) price + trademark.length());
    }

    /**
     * Метод toString().
     *
     * @return возвращает марку ручки и цену в виде строки
     */
    @Override
    public String toString() {
        return ("Price of "+trademark+" pen = "+price);
    }
}