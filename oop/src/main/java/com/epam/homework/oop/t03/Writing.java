package com.epam.homework.oop.t03;

public class Writing {

    enum typeOfWritingEnum {PENCIL, PEN}

    private String color;
    private typeOfWritingEnum typeOfWriting;

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
