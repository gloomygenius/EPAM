package com.epam.homework.strings.t03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: 17.10.2016  допилить до ума
@SuppressWarnings("All")
public class Html {
    private String filePath;
    private String textHtml;

    public Html() {
    }

    public Html(String path) {
        setFilePath(path);
    }

    public void readText() {
        Charset cs = Charset.forName("CP1251");
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = null;
            String newline = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                text.append(line);
                text.append(newline);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.textHtml = text.toString();
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void findLinks() {
        Pattern pattern = Pattern.compile("");
        if (textHtml == null) {
            System.out.println(textHtml);
            return;
        }
        Matcher matcher = pattern.matcher(textHtml);
        if (matcher.find()) System.out.println(matcher.group(0));
    }
}