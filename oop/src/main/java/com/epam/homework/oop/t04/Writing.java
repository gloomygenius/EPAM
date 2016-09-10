package com.epam.homework.oop.t04;

public class Writing extends StationeryBrandSort {


    enum typeOfWritingEnum {PENCIL, PEN}

    private String color;
    private typeOfWritingEnum typeOfWriting;

    public Writing(String brand, double price) {
        super(brand, price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public typeOfWritingEnum getTypeOfWriting() {
        return typeOfWriting;
    }

    public void setTypeOfWriting(typeOfWritingEnum typeOfWriting) {
        this.typeOfWriting = typeOfWriting;
    }

}
