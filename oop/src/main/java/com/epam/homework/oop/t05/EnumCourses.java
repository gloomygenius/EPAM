package com.epam.homework.oop.t05;

@SuppressWarnings("WeakerAccess")
public enum EnumCourses {
    PHYSICS("double"),
    BIOLOGY("int"),
    PHYLOSOPHY("double"),
    PROGRAMMING("int");

    final public String typeOfMark;

    EnumCourses(String typeOfMark) {
        this.typeOfMark = typeOfMark;
    }
}
