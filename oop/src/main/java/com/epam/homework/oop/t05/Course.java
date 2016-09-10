package com.epam.homework.oop.t05;

public class Course {
    private enumCourses course;
    private int intMark = -1;
    private double doubleMark = -1;

    public Course(enumCourses course) {
        this.course = course;
    }

    public Course(enumCourses course, int mark) {
        this(course);
        intMark = mark;
    }

    public Course(enumCourses course, double mark) {
        this(course);
        doubleMark = mark;
    }

    public String toString() {
        String outString="курс " + course.toString()+" оценка: ";
        if (intMark != -1) return outString+intMark;
        else return outString+doubleMark;
    }
}
