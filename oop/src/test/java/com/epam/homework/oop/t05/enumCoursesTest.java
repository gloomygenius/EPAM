package com.epam.homework.oop.t05;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EnumCoursesTest {
    @Test
    public void testOfConstructor() {
        assertThat(EnumCourses.BIOLOGY.typeOfMark,is("int"));
    }
}