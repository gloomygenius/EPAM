package com.epam.homework.strings.t03;

import org.junit.Test;

public class HtmlTest {
    Html html = new Html();
    @Test
    public void findLinksTest(){
        html.setFilePath("C:\\Java\\Java.SE.03.Information handling_task_attachment.html");
        html.findLinks();
    }
}