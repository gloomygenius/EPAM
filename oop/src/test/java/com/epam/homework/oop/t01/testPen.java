package com.epam.homework.oop.t01;

import org.junit.Test;

import static org.junit.Assert.*;

public class testPen {
    Pen pen1 = new Pen();
    Pen pen2 = new Pen();
    Pen pen3 = new Pen();
    {
        pen1.setPrice(250.0);
        pen2.setPrice(250.0);
        pen3.setPrice(150.0);

        pen1.setTrademark("Bic");
        pen2.setTrademark("Bic");
        pen3.setTrademark("Parker");

    }
    @Test
    public void testEqualsAndHashCode() {
        assertTrue(pen1.equals(pen2));
        assertFalse(pen1.equals(pen3));
        assertEquals(pen1.hashCode(),253);
        assertEquals(pen3.hashCode(),156);
    }

    @Test
    public void testToString() {
        assertEquals(pen1.toString(),"Price of Bic pen = 250.0");
        assertEquals(pen1.toString(),"Price of Bic pen = 250.0");
    }

}
