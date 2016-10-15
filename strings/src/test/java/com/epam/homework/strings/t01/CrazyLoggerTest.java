package com.epam.homework.strings.t01;

import org.junit.Test;

public class CrazyLoggerTest {
    private CrazyLogger logger = new CrazyLogger();

    @Test
    public void addLogTest() {
        logger.addLog("Первая запись в лог: ура!");
        logger.addLog("Вторая запись в лог: всё нормально");
        logger.addLog("Третья запись в лог: а вот здесь ошибка");
        logger.addLog("Четвёрта запись в лог: всё в норме");
        logger.saveLog("src/test/resources/log.txt");
        //ищем нужные записи
        System.out.println(CrazyLogger.findLog("ошибка", "src/test/resources/log.txt"));
    }
}