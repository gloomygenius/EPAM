package com.epam.homework.exсeptions.t01;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExplorerTest {
    private Explorer explorer = new Explorer("src\\main\\");

    @Test
    public void showItems() throws Exception {
        assertThat(explorer.showItems(), is("java/\r\nresources/\r\n"));
    }

    @Test
    public void showItemWithPath() {
        assertThat(explorer.showItems("src\\main\\java\\com\\epam\\homework\\exсeptions"), is("t01/\r\nt02/\r\n"));
    }

    @Test
    public void createTextTest() {
        final String PATH = "src\\test\\resources\\";
        final String FILE_NAME = "note";
        explorer.createTextFile("Какой-то текст", FILE_NAME, PATH);
        assertThat(explorer.readTextFile(PATH + FILE_NAME + ".txt"),is("Какой-то текст"));
    }

    @Test
    public void removeFileTest() {
        explorer.removeFile("src\\test\\resources\\note.txt");
    }

    @Test
    public void editTextFileText() {
        explorer.createTextFile("Old text", "foredit", "src\\test\\resources\\");
        explorer.editTextFile("src\\test\\resources\\foredit.txt", "\r\nnew text!");
    }
}