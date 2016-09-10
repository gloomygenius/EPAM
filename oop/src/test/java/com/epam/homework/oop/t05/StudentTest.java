package com.epam.homework.oop.t05;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student = new Student();

    @Test
    public void testCourses(){
        student.addCourse(enumCourses.BIOLOGY);
        assertTrue(student.isStudy(enumCourses.BIOLOGY));
    }

}