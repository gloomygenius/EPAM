package com.epam.homework.strings.t02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class QuestionsTest {
    Questions questions = new Questions();

    @Test
    public void getQuestionsTestEn() {
        questions.setLocal("en");
        assertThat(questions.getQuestions(1),is("What is Java? It's programming language and platform"));
        assertThat(questions.getQuestions(2),is("What is EPAM? It's succesfull IT company"));
    }
    @Test
    public void getQuestionsTestRu() {
        questions.setLocal("ru");
        assertThat(questions.getQuestions(1),is("Что такое Java? Это язык программирования и платформа"));
        assertThat(questions.getQuestions(2),is("Что такое ЕПАМ? Это успешная IT компания"));
    }
}