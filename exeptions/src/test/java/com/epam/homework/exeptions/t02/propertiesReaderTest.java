package com.epam.homework.exeptions.t02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class propertiesReaderTest {

    @Test
    public void getPropertiesTest(){
        assertThat(PropertiesReader.getProperties("src\\test\\resources\\example.properties", "id"),is("1"));
        assertNull(PropertiesReader.getProperties("src\\test\\resources\\example.properties", "blabla"));
        assertNull(PropertiesReader.getProperties("src\\test\\resources\\blablabla.properties", "blabla"));
    }
}