package com.epam.homework.iostreams.t01;

import ch.qos.logback.core.util.SystemInfo;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JavaKeyWordsTest {
    JavaKeyWords javaKeyWords = new JavaKeyWords();

    @Test
    public void setFileTest() {
        javaKeyWords.setFile(new File("src\\test\\resources\\HttpServer.java"));
        assertThat(javaKeyWords.file.getPath(), is("src\\test\\resources\\HttpServer.java"));
    }

    @Test
    public void CheckAndWriteKeyWordsTest(){
        javaKeyWords.setFile(new File("src\\test\\resources\\HttpServer.java"));
        javaKeyWords.checkAndWriteKeyWords("src\\test\\resources\\result.txt");
    }
}