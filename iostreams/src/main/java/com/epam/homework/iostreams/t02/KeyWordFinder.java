package com.epam.homework.iostreams.t02;

import com.epam.homework.iostreams.t01.*;

import java.io.*;

@SuppressWarnings("WeakerAccess")
public class KeyWordFinder extends JavaKeyWords {

    @Override
    public String readFile() {
        String text = null;
        try (FileReader reader = new FileReader(file)) {
            char[] buffer = new char[(int) file.length()];
            //noinspection ResultOfMethodCallIgnored
            reader.read(buffer);
            text = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}