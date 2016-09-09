package com.epam.homework.oop.t03;

public class OfficeTool {
    enum typeOfOfficeToolEnum {STAPLER, SCISSORS, CLIPS}

    private typeOfOfficeToolEnum typeOfOfficeTool;

    public OfficeTool(typeOfOfficeToolEnum a){
        typeOfOfficeTool=a;
    }

    public typeOfOfficeToolEnum getTypeOfOfficeTool() {
        return typeOfOfficeTool;
    }

    public void setTypeOfOfficeTool(typeOfOfficeToolEnum typeOfOfficeTool) {
        this.typeOfOfficeTool = typeOfOfficeTool;
    }


}
