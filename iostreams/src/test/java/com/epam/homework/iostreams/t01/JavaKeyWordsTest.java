package com.epam.homework.iostreams.t01;

import org.junit.Test;

import java.io.File;

public class JavaKeyWordsTest {
    private JavaKeyWords javaKeyWords = new JavaKeyWords();

    @Test
    public void setFileTest() {
        javaKeyWords.setFile(new File("src\\test\\resources\\Example.java"));
    }

    @Test
    public void CheckAndWriteKeyWordsTest() {
        javaKeyWords.setFile(new File("src\\test\\resources\\Example.java"));
        javaKeyWords.checkAndWriteKeyWords("src\\test\\resources\\result.txt");
    }
}