package com.epam.homework.oop.t06;

public class AtomicSubmarine {
    class EngineSubmarine {
        String brand = "Bently";
        int power = 4000; // л.с.
    }

    public String startFloat() {
        EngineSubmarine engine = new EngineSubmarine();
        return "Атомная лодка плывёт!";
    }
}
