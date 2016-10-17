package com.epam.homework.exсeptions.t01;

import java.io.*;

@SuppressWarnings("WeakerAccess")

public class Explorer {
    String globalPath;

    public Explorer(String globalPath) {
        this.globalPath = globalPath;
    }

    public String showItems() {
        StringBuilder builder = new StringBuilder();
        File file = new File(globalPath);
        if ((file.isDirectory()) && (file.listFiles() != null)) {
            //noinspection ConstantConditions
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    builder.append(item.getName()).append("/").append("\r\n");
                } else {
                    builder.append(item.getName()).append("\r\n");
                }
            }
        } else builder.append(file.getName());
        return builder.toString();
    }

    public String showItems(String path) {
        globalPath = path;
        return showItems();
    }

    public void createTextFile(String text, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(globalPath + fileName + ".txt"))) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createTextFile(String text, String fileName, String path) {
        globalPath = path;
        createTextFile(text, fileName);
    }

    public void removeFile(String path) {
        File file = new File(path);
        //noinspection ResultOfMethodCallIgnored
        if (!file.delete()) System.err.println("File was not deleted");
    }

    public void editTextFile(String path, String newText) {
        try (FileWriter fw = new FileWriter(path, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(newText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readTextFile(String path) {
        File file;
        try (FileReader reader = new FileReader(file = new File(path))) {
            char[] buf = new char[(int) file.length()];
            //noinspection ResultOfMethodCallIgnored
            reader.read(buf);
            return new String(buf).trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}