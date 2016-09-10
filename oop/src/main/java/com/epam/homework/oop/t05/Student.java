package com.epam.homework.oop.t05;

import java.util.ArrayList;


public class Student {
    private ArrayList<enumCourses> ListOfCourses = new ArrayList<>();

    public void addCourse(enumCourses course) {
        ListOfCourses.add(course);
    }

    public boolean isStudy (enumCourses course){
        return ListOfCourses.contains(course);
    }
}
