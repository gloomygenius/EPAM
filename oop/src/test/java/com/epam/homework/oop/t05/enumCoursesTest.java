package com.epam.homework.oop.t05;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class enumCoursesTest {
    @Test
    public void testOfConstructor() {
        assertThat(enumCourses.BIOLOGY.typeOfMark,is("int"));
    }
}