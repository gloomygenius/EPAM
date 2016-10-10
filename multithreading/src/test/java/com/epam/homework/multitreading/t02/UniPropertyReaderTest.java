package com.epam.homework.multitreading.t02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniPropertyReaderTest {

    @Test
    public void getPropertyTest(){
        assertThat(UniPropertyReader.getProperty("src/test/resources/t03.properties","param"),is("example"));
    }
}