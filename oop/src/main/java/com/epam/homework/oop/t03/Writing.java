package com.epam.homework.oop.t03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Writing extends Stationery {
    private String color;
    private typeOfWritingEnum typeOfWriting;

    @SuppressWarnings({"WeakerAccess", "unused"}) // этот функционал не исполбзуется в тестах
    public enum typeOfWritingEnum {
        PENCIL, PEN
    }

    public Writing(String brand, double price) {
        super(brand, price);
    }
}
