package com.epam.homework.multitreading.t02;

import java.io.*;
import java.util.Properties;

public class UniPropertyReader {
    public static String getProperty(String path, String key) {
        Properties properties = new Properties();
        String value = null;
        try (InputStream stream = new FileInputStream(new File(path))) {
            properties.load(stream);
            value = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
