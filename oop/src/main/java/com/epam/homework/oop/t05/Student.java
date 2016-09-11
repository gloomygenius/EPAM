package com.epam.homework.oop.t05;

import java.util.ArrayList;


public class Student {
    private ArrayList<Course> ListOfCourses = new ArrayList<>();

    public void addCourse(EnumCourses enumCourse) {
        ListOfCourses.add(new Course(enumCourse));
    }

    public boolean isStudy (EnumCourses enumCourse){
        return ListOfCourses.contains(enumCourse);
    }
}
