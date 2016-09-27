package com.epam.homework.iostreams.t03;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UnicodeTransformatorTest {
    UnicodeTransformator transformator = new UnicodeTransformator();

    @Test
    public void setFileTest() {
        transformator.setFile(new File("src\\test\\resources\\HttpServer.java"));
        assertThat(transformator.getFile().getPath(), is("src\\test\\resources\\HttpServer.java"));
    }

    @Test
    public void transformToUtf16() {
        File inFile = new File("src\\test\\resources\\HttpServer.java");
        transformator.setFile(inFile);
        File outFile = new File("src\\test\\resources\\HttpServerUTF16.java");
        transformator.setOutFile(outFile);
        transformator.transformToUtf16();
    }
}