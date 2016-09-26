package com.epam.homework.strings.t01;

import org.junit.Test;

import java.io.*;
import java.util.regex.Pattern;

public class CrazyLoggerTest {
    CrazyLogger logger = new CrazyLogger();

    @Test
    public void addLogTest() {
        logger.addLog("Первая запись в лог");
        logger.addLog("Вторая запись в лог");
        logger.addLog("Третья запись в лог");

        try (OutputStream stream = System.out) {
            logger.findLog(Pattern.compile("Вторая"),stream);

        } catch (Exception e) {
            System.err.println("Ошибка!");
        }
    }
}