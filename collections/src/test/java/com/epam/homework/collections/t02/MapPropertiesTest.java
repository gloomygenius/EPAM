package com.epam.homework.collections.t02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MapPropertiesTest {
    private MapProperties properties = new MapProperties();

    @Test
    public void initProperties() throws Exception {
        properties.initProperties("src\\test\\resources\\example.properties");
        assertThat(properties.getMap().size(), is(3)); // проверяем, что в мапе все три property
    }

    @Test
    public void getProperty() throws Exception {
        properties.initProperties("src\\test\\resources\\example.properties");
        assertThat(properties.getProperty("firstKey"), is("30"));
        assertThat(properties.getProperty("secondKey"), is("40"));
        assertThat(properties.getProperty("thirdKey"), is("50"));
    }
}