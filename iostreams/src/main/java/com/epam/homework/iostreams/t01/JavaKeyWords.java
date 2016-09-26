package com.epam.homework.iostreams.t01;

import com.sun.istack.internal.NotNull;

import java.io.*;

public class JavaKeyWords {
    File file;
    String javaCode;

    public void setFile(File file) {
        this.file = file;
    }

    public String readFile() {
        StringBuilder builder = new StringBuilder(400);
        try (FileInputStream stream = new FileInputStream(file)) {
            int i = -1;
            while ((i = stream.read()) != -1) {
                builder.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public void checkAndWriteKeyWords(String filePath) {
        javaCode = readFile();
        StringBuilder builder = new StringBuilder();
        int count = 0;
        builder.append("Ключевые слова, найденные в файле: \r\n");
        for (String keyWord :
                getAllKeyWords()) {
            count += countKeyWord(keyWord);
            builder.append(keyWord+" \r\n");
        }
        builder.append("\r\n всего найдено "+count+" ключевых слов");
        try (FileOutputStream stream = new FileOutputStream(filePath)) {
            stream.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] getAllKeyWords() {
        String[] keyWords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto,package",
                "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected",
                "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
                "long", "strictfp", "volatile", "const", "float", "native", "super", "while", "true", "false", "null"};
        return keyWords;
    }

    private int countKeyWord(String keyWord) {
        int count = 0;
        if (javaCode.contains(keyWord)) {
            int i = javaCode.indexOf(keyWord);
            while (i >= 0) {
                count++;
                i = javaCode.indexOf(keyWord, i + 1);
            }
        }
        return count;
    }
}