package com.epam.homework.strings.t01;

import java.io.*;

public class Main {
    CrazyLogger logger = new CrazyLogger();

    public static void main(String[] args) {
        Main mainy=new Main();
        //main.addLogTest();
        mainy.logger.addLog("Первая запись в лог \n");
        mainy.logger.addLog("Вторая запись в лог \n");
        try (BufferedWriter writer= new BufferedWriter(new FileWriter("C:\\\\Java\\Log.txt"))) {
            mainy.logger.streamOutCrazyLogger(writer);
        }catch (Exception e){
            //
        }
    }
    public void addLogTest() {
        logger.addLog("Первая запись в лог");
        logger.addLog("Вторая запись в лог");
        File file = new File("C:\\\\Java\\text.txt");
        try (BufferedWriter buf = new BufferedWriter(new FileWriter(file))) {
            logger.streamOutCrazyLogger(buf);
            buf.close();
        }
        catch (Exception e){}
    }
}
