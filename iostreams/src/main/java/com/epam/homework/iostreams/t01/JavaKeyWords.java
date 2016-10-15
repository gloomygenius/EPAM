package com.epam.homework.iostreams.t01;

import java.io.*;

public class JavaKeyWords {
    protected File file;
    private String javaCode;

    public void setFile(File file) {
        this.file = file;
    }

    @SuppressWarnings("Duplicates")
    public String readFile() {
        StringBuilder builder = new StringBuilder((int) file.length());
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

    public void checkAndWriteKeyWords(String filePath) {
        javaCode = readFile();
        StringBuilder builder = new StringBuilder();
        int count = 0;
        builder.append("Ключевые слова, найденные в файле: \r\n");
        for (String keyWord :
                getAllKeyWords()) {
            count += countKeyWord(keyWord);
            builder.append(keyWord).append(" \r\n");
        }
        builder
                .append("\r\n всего найдено ")
                .append(count)
                .append(" ключевых слов");
        try (FileOutputStream stream = new FileOutputStream(filePath)) {
            stream.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] getAllKeyWords() {
        return new String[]{"abstract", "continue", "for", "new", "switch", "assert", "default", "goto,package",
                "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected",
                "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
                "long", "strictfp", "volatile", "const", "float", "native", "super", "while", "true", "false", "null"};
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