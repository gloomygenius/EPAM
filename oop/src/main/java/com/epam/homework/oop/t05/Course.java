package com.epam.homework.oop.t05;

public class Course {
    private EnumCourses course;
    private int intMark = -1;
    private double doubleMark = -1;

    public Course(EnumCourses course) {
        this.course = course;
    }

    public Course(EnumCourses course, int mark) {
        this(course);
        intMark = mark;
    }

    public Course(EnumCourses course, double mark) {
        this(course);
        doubleMark = mark;
    }

    public String toString() {
        String outString="курс " + course.toString()+" оценка: ";
        if (intMark != -1) return outString+intMark;
        else return outString+doubleMark;
    }
}
