package com.epam.homework.iostreams.t04;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FilmTest {
    Film inception=new Film("Inception");
    Actor diCaprio=new Actor("Leonardo Wilhelm DiCaprio");
    Actor gordonLevitt=new Actor("Joseph Gordon-Levitt");

    @Test
    public void mainActorsTest(){
        inception.setMainActors(diCaprio, gordonLevitt);
        assertThat(Arrays.toString(inception.getMainActors()),is("[Leonardo Wilhelm DiCaprio, Joseph Gordon-Levitt]"));
    }
}