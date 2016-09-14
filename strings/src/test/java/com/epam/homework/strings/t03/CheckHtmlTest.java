package com.epam.homework.strings.t03;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CheckHtmlTest {
    CheckHtml checkHtml = new CheckHtml();
    ArrayList
    @Test
    public void addStream() {
        File file = new File("C:\\Java\\Java.SE.03.Information handling_task_attachment.html");
        try (FileReader reader = new FileReader(file)) {
            checkHtml.addStream(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void CkeckLinks() {

    }
}