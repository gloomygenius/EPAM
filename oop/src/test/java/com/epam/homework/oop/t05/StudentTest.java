package com.epam.homework.oop.t05;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student = new Student();

    @Test
    public void testCourses(){
        student.addCourse(EnumCourses.BIOLOGY);
        assertTrue(student.isStudy(EnumCourses.BIOLOGY));
    }
}