package com.epam.homework.oop.t05;

public enum EnumCourses {
    PHYSICS("double"),
    BIOLOGY("int"),
    PHYLOSOPHY("double"),
    PROGRAMMING("int");

    public String typeOfMark;

    private EnumCourses(String typeOfMark) {
        this.typeOfMark = typeOfMark;
    }

}
