package com.epam.homework.oop.t03;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Drawing extends Stationery {

    private typeOfDrawingEnum typeOfDrawing;

    @SuppressWarnings({"WeakerAccess", "unused"}) // этот функционал не исполбзуется в тестах
    private enum typeOfDrawingEnum {
        COLOR_PENCIL, INK, RULER, BRUSH
    }

    public Drawing(String brand, double price) {
        super(brand, price);
    }
}