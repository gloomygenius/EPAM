package com.epam.homework.oop.t05;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CourseTest {
    Course course1 = new Course(enumCourses.BIOLOGY,4.5);
    Course course2 = new Course(enumCourses.PROGRAMMING,5);
    @Test
    public void testToString(){
        assertThat(course1.toString(),is("курс BIOLOGY оценка: 4.5"));
        assertThat(course2.toString(),is("курс PROGRAMMING оценка: 5"));
    }
}