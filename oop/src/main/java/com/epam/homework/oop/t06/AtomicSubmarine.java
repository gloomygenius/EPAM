package com.epam.homework.oop.t06;

import lombok.Getter;

@SuppressWarnings("WeakerAccess")
public class AtomicSubmarine {
    @Getter
    class EngineSubmarine {
        String brand = "Bently";
        int power = 4000; // л.с.
    }

    public String startFloat() {
        EngineSubmarine engine = new EngineSubmarine();
        return new StringBuilder()
                .append("Атомная лодка плывёт! Двиагетель ")
                .append(engine.getBrand())
                .append(" мощьностью ")
                .append(engine.getPower())
                .append(" л.с.")
                .toString();
    }
}