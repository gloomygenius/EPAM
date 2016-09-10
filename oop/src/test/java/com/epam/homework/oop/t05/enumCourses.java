package com.epam.homework.oop.t05;

public enum enumCourses {
    PHYSICS("double"),
    BIOLOGY("int"),
    PHYLOSOPHY("double"),
    PROGRAMMING("int");

    public String typeOfMark;

    private enumCourses(String typeOfMark) {
        this.typeOfMark = typeOfMark;
    }

}
