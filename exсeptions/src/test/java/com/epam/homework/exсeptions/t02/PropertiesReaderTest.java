package com.epam.homework.exсeptions.t02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PropertiesReaderTest {

    @Test
    public void getPropertiesTest() {
        assertThat(PropertiesReader.getProperties("src\\test\\resources\\example.properties", "id"), is("1"));
        assertThat(PropertiesReader.getProperties("src\\test\\resources\\example.properties", "name"), is("Павел"));
        assertNull(PropertiesReader.getProperties("src\\test\\resources\\example.properties", "blabla"));
        assertNull(PropertiesReader.getProperties("src\\test\\resources\\blablabla.properties", "blabla"));
    }
}