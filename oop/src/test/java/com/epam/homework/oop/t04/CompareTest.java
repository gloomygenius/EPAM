package com.epam.homework.oop.t04;

import com.epam.homework.oop.t03.*;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CompareTest {
    private Stationery[] stationaries = new Stationery[5];
    {
        stationaries[0] = new OfficeTool("Parker", 135.0);
        stationaries[1] = new Writing("Bic", 45.0);
        stationaries[2] = new Drawing("DALER ROWNEY", 163.0);
        stationaries[3] = new Drawing("Delay", 113.0);
        stationaries[4] = new Drawing("DALER ROWNEY", 153.0);
    }
    @Test
    public void testSortByBrand() {

        Arrays.sort(stationaries, new CompareByBrand());
        assertThat(stationaries[0].getBrand(), is("Bic"));
        assertThat(stationaries[1].getBrand(), is("DALER ROWNEY"));
        assertThat(stationaries[2].getBrand(), is("DALER ROWNEY"));
        assertThat(stationaries[3].getBrand(), is("Delay"));
        assertThat(stationaries[4].getBrand(), is("Parker"));
    }

    @Test
    public void testSortByPrice(){
        Arrays.sort(stationaries, new CompareByPrice());
        assertThat(stationaries[0].getPrice(), is(45.0));
        assertThat(stationaries[1].getPrice(), is(113.0));
        assertThat(stationaries[2].getPrice(), is(123.0));
        assertThat(stationaries[3].getPrice(), is(135.0));
        assertThat(stationaries[4].getPrice(), is(153.0));
    }
    @Test
    public void testSortByBrandAndPrice(){
        Arrays.sort(stationaries, new CompareByBrandAndPrice());
        assertThat(stationaries[0].getBrand(), is("Bic"));
        assertThat(stationaries[1].getBrand(), is("DALER ROWNEY"));
        assertThat(stationaries[1].getPrice(), is(153.0));
        assertThat(stationaries[2].getBrand(), is("DALER ROWNEY"));
        assertThat(stationaries[2].getPrice(), is(163.0));
        assertThat(stationaries[3].getBrand(), is("Delay"));
        assertThat(stationaries[4].getBrand(), is("Parker"));
    }
}