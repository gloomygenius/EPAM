package com.epam.homework.oop.t06;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AtomicSubmarineTest {

    AtomicSubmarine atomicSubmarine = new AtomicSubmarine();

    @Test
    public void startFloatTest(){
        assertThat(atomicSubmarine.startFloat(),is("Атомная лодка плывёт!"));
    }
}