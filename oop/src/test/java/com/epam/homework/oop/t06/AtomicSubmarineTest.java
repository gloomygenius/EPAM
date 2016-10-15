package com.epam.homework.oop.t06;

import com.epam.homework.oop.t07.Builers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
@Builers(
        nameMainEngineer = "EfimNikonov",
        nameProjectManager = "Peter the Great")
public class AtomicSubmarineTest {

    private AtomicSubmarine atomicSubmarine = new AtomicSubmarine();

    @Test
    public void startFloatTest(){
        assertThat(atomicSubmarine.startFloat(),
                is("Атомная лодка плывёт! Двиагетель Bently мощьностью 4000 л.с."));
    }
}