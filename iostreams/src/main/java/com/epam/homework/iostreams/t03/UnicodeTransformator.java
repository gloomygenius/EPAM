package com.epam.homework.iostreams.t03;

import lombok.*;

import java.io.*;

@SuppressWarnings("WeakerAccess")
@Setter
@Getter
public class UnicodeTransformator {
    private File file;
    private File outFile;

    public void transformToUtf16() {
        String text = readFile();
        writeFile(text);

    }

    private void writeFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(outFile), "UTF16"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile() {
        StringBuilder builder = new StringBuilder((int) file.length());
        //noinspection Duplicates
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), "UTF8"))) {
            String nextString;
            while ((nextString = reader.readLine()) != null) {
                builder.append(nextString).append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}