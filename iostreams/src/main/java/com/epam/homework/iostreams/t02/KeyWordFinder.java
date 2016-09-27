package com.epam.homework.iostreams.t01;

import java.io.*;

public class KeyWordFinder extends JavaKeyWords{

    @Override
    public String readFile() {
        String text = null;
        try (FileReader reader = new FileReader(file)) {
            int i = -1;
            char[] buffer = new char[(int)file.length()];
            reader.read(buffer);
            text=new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}