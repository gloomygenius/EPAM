package com.epam.homework.oop.t03;

public class Drawing extends Stationery {

    enum typeOfDrawingEnum {COLOR_PENCIL, INK, RULER, BRUSH}
    private typeOfDrawingEnum typeOfDrawing;

    public typeOfDrawingEnum getTypeOfDrawing() {
        return typeOfDrawing;
    }

    public void setTypeOfDrawing(typeOfDrawingEnum typeOfDrawing) {
        this.typeOfDrawing = typeOfDrawing;
    }
}