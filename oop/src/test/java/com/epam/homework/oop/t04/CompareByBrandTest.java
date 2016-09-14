package com.epam.homework.oop.t04;

import com.epam.homework.oop.t03.*;
import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CompareByBrandTest {

    @Test
    public void testSort() {
        Stationery[] stationaries = new Stationery[5];
        stationaries[0] = new OfficeTool("Parker", 135.0);
        stationaries[1] = new Writing("Bic", 45.0);
        stationaries[2] = new Drawing("DALER ROWNEY", 123.0);
        stationaries[3] = new Drawing("Delay", 113.0);
        stationaries[4] = new Drawing("DALER ROWNEY", 153.0);
        Arrays.sort(stationaries,new CompareByBrand());
        assertThat(stationaries[0].getBrand(),is("Bic"));
        assertThat(stationaries[1].getBrand(),is("DALER ROWNEY"));
        assertThat(stationaries[2].getBrand(),is("DALER ROWNEY"));
        assertThat(stationaries[3].getBrand(),is("Delay"));
        assertThat(stationaries[4].getBrand(),is("Parker"));
    }
}