package com.epam.homework.strings.t02;

import java.util.Locale;
import java.util.ResourceBundle;

public class Questions {
    private Locale locale=new Locale("ru");
    public void setLocal(String lang) {
        locale=new Locale(lang);
    }

    public String getQuestions(int num) {
        ResourceBundle bundle = ResourceBundle.getBundle("ListQuestions",locale);
        StringBuilder outString = new StringBuilder();
        outString.append(bundle.getString("Question"+num)).append(" "+bundle.getString("Answer" +num));
        return (outString.toString());
    }
}
