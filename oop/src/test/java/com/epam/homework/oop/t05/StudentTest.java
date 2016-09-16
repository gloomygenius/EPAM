package com.epam.homework.oop.t05;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentTest {
    Student student=new Student("Вася");
    {
        student.addCourse(EnumCourses.BIOLOGY, 4.5);
        student.addCourse(EnumCourses.PHYLOSOPHY, 5.5); // Дробная оценка преобразуется в int
        student.addCourse(EnumCourses.PROGRAMMING, 2.5); // Дробная оценка преобразуется в int
        student.addCourse(EnumCourses.PHYSICS, 3.5);
    }
    @Test
    public void testStudentMark(){
        assertThat(student.showCourses(),is(
                        "PHYSICS mark=3.5\n"+
                        "BIOLOGY mark=4\n"+
                        "PHYLOSOPHY mark=5.5\n"+
                        "PROGRAMMING mark=2\n"));

    }
}