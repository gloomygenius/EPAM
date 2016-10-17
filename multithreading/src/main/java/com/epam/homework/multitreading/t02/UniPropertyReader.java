package com.epam.homework.multitreading.t02;

import java.io.*;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class UniPropertyReader {
    public static String getProperty(String path, String key) {
        Properties properties = new Properties();
        String value = null;
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(new File(path)))) {
            properties.load(stream);
            value = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}