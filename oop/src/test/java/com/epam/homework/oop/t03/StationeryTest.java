package com.epam.homework.oop.t03;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StationeryTest {


    Stationery stationary1 = new Writing("Bic", 45.0);
    Stationery stationary2 = new OfficeTool("Parker", 135.0);
    Stationery stationary3 = new Drawing("DALER ROWNEY", 123.0);

    @Test
    public void testBrand() {
        assertThat(stationary1.getBrand(), is("Bic"));
        assertThat(stationary2.getBrand(), is("Parker"));
        assertThat(stationary3.getBrand(), is("DALER ROWNEY"));
    }

    @Test
    public void testPrice() {
        assertThat(stationary1.getPrice(), is(45.0));
        assertThat(stationary2.getPrice(), is(135.0));
        assertThat(stationary3.getPrice(), is(123.0));
    }
}