package com.epam.homework.strings.t01;

import java.io.BufferedWriter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {
    private StringBuilder crazyLogger = new StringBuilder();

    public void addLog(String massage) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        crazyLogger.append(time.format(formatter)).append(" - ").append(massage).append("\n");
    }

    public void streamOutCrazyLogger(BufferedWriter stream) {
        try {

            stream.write(crazyLogger.toString());
            System.out.println(crazyLogger.toString());
            stream.close();
        }
        catch (Exception e) {}
    }
}
