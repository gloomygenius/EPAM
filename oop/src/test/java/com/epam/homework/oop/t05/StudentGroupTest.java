package com.epam.homework.oop.t05;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentGroupTest {
    ArrayList<StudentGroup> group = new ArrayList<>();

    {
        group.add(new StudentGroup(EnumCourses.BIOLOGY));
        group.add(new StudentGroup(EnumCourses.PHYLOSOPHY));
        group.add(new StudentGroup(EnumCourses.PHYSICS));
    }
    @Test
    public void addToGroupTest(){
        group.add()
    }

}