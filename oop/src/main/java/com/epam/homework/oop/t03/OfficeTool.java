package com.epam.homework.oop.t03;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OfficeTool extends Stationery {
    private typeOfOfficeToolEnum typeOfOfficeTool;

    @SuppressWarnings({"WeakerAccess", "unused"}) // этот функционал не исполбзуется в тестах
    public enum typeOfOfficeToolEnum {
        STAPLER, SCISSORS, CLIPS
    }

    public OfficeTool(String brand, double price) {
        super(brand, price);
    }
}