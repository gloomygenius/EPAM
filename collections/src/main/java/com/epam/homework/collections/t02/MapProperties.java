package com.epam.homework.collections.t02;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Getter
public class MapProperties {
    Map<String, String> map = new HashMap<>();

    public void initProperties(String path) {

        try (FileInputStream stream = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(stream);
            for (final String name : properties.stringPropertyNames())
                map.put(name, properties.getProperty(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return map.get(key);
    }
}