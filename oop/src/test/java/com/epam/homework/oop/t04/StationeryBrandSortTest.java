package com.epam.homework.oop.t04;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StationeryBrandSortTest {

    ArrayList<StationeryBrandSort> stationeryBrandSorts = new ArrayList<>();

    @Test
    public void testSort() {
        StationeryBrandSort[] stationaries = new StationeryBrandSort[5];
        stationaries[1] = new OfficeTool("Parker", 135.0);
        stationaries[0] = new Writing("Bic", 45.0);
        stationaries[2] = new Drawing("DALER ROWNEY", 123.0);
        stationaries[3] = new Drawing("Delay", 113.0);
        stationaries[4] = new Drawing("DALER ROWNEY", 153.0);
        int total=0;
        while (total<(stationaries.length-1)){
            if (stationaries[total].compareTo(stationaries[total+1])>0){
                StationeryBrandSort buffer = stationaries[total];
                stationaries[total]=stationaries[total+1];
                stationaries[total+1]=buffer;
                total=0;
                continue;
            }
        total++;
        }
        assertThat(stationaries[0].getBrand(),is("Bic"));
        assertThat(stationaries[1].getBrand(),is("DALER ROWNEY"));
        assertThat(stationaries[2].getBrand(),is("DALER ROWNEY"));
        assertThat(stationaries[3].getBrand(),is("Delay"));
        assertThat(stationaries[4].getBrand(),is("Parker"));
    }
}