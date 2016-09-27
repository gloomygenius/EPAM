package com.epam.homework.iostreams.t02;

import com.epam.homework.iostreams.t01.KeyWordFinder;
import org.junit.Test;
import java.io.File;


public class KeyWordFinderTest {
    KeyWordFinder javaKeyWords = new KeyWordFinder();

    @Test
    public void setFileTest() {
        javaKeyWords.setFile(new File("src\\test\\resources\\HttpServer.java"));
    }

    @Test
    public void CheckAndWriteKeyWordsTest(){
        javaKeyWords.setFile(new File("src\\test\\resources\\HttpServer.java"));
        javaKeyWords.checkAndWriteKeyWords("src\\test\\resources\\result.txt");
    }
}
