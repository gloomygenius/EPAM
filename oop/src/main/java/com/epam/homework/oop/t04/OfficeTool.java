package com.epam.homework.oop.t04;

public class OfficeTool extends StationeryBrandSort {
    enum typeOfOfficeToolEnum {STAPLER, SCISSORS, CLIPS}

    private typeOfOfficeToolEnum typeOfOfficeTool;

    public OfficeTool(String brand, double price) {
        super(brand, price);
    }

    public typeOfOfficeToolEnum getTypeOfOfficeTool() {
        return typeOfOfficeTool;
    }

    public void setTypeOfOfficeTool(typeOfOfficeToolEnum typeOfOfficeTool) {
        this.typeOfOfficeTool = typeOfOfficeTool;
    }

}
