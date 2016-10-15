package com.epam.homework.oop.t05;

import lombok.Getter;

import java.util.EnumMap;


@SuppressWarnings("WeakerAccess")
public class Student {
    private EnumMap<EnumCourses, Number> MapOfCourses = new EnumMap<>(EnumCourses.class);
    @Getter
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(EnumCourses enumCourse, double mark) {
        if (enumCourse.typeOfMark.equals("double")) MapOfCourses.put(enumCourse, mark);
        if (enumCourse.typeOfMark.equals("int")) MapOfCourses.put(enumCourse, Math.round(mark));
    }

    public String showCourses() {
        StringBuilder builder = new StringBuilder();
        for (EnumCourses course : EnumCourses.values()) {
            if (MapOfCourses.containsKey(course)) {
                builder
                        .append(course.toString())
                        .append(" mark=")
                        .append(MapOfCourses
                                .get(course)).append("\n");
            }
        }
        return builder.toString();
    }
}
