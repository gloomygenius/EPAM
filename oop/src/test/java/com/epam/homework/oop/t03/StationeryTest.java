package com.epam.homework.oop.t03;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StationeryTest {

    public Stationery[] stationaries = new Stationery[3];

    {
        stationaries[0] = new Writing("Bic", 45.0);
        stationaries[1] = new OfficeTool("Parker", 135.0);
        stationaries[2] = new Drawing("DALER ROWNEY", 123.0);

    }

    @Test
    public void testBrand() {
        assertThat(stationaries[0].getBrand(), is("Bic"));
        assertThat(stationaries[1].getBrand(), is("Parker"));
        assertThat(stationaries[2].getBrand(), is("DALER ROWNEY"));
    }

    @Test
    public void testPrice() {
        assertThat(stationaries[0].getPrice(), is(45.0));
        assertThat(stationaries[1].getPrice(), is(135.0));
        assertThat(stationaries[2].getPrice(), is(123.0));
    }
}