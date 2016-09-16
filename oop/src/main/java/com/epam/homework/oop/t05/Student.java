package com.epam.homework.oop.t05;

import java.util.ArrayList;
import java.util.EnumMap;


public class Student {
    private EnumMap<EnumCourses, Number> MapOfCourses = new EnumMap<EnumCourses, Number>(EnumCourses.class);
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(EnumCourses enumCourse, double mark) {
        if (enumCourse.typeOfMark == "double") MapOfCourses.put(enumCourse, mark);
        if (enumCourse.typeOfMark == "int") MapOfCourses.put(enumCourse, (int) mark);
    }

    public boolean isStudy(EnumCourses enumCourse) {
        return MapOfCourses.containsKey(enumCourse);
    }

    public String getName() {
        return name;
    }

    public String showCourses() {
        StringBuilder builder = new StringBuilder();
        for (EnumCourses course : EnumCourses.values()) {
            if (MapOfCourses.containsKey(course)) {
                builder.append(course.toString()+" mark="+MapOfCourses.get(course) + "\n");
            }
        }
        return builder.toString();
    }
}
