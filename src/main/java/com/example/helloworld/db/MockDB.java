package com.example.helloworld.db;

import com.example.helloworld.api.Answer;
import com.example.helloworld.api.PersonalityType;
import com.example.helloworld.api.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MockDB {
    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer("Red", 1));
        answers.add(new Answer("Blue", 2));
        answers.add(new Answer("Green", 3));
        questions.add(new Question("Favourite Colour", answers));
        return questions;
    }

    public HashMap<Integer, String> getPersonalities() {
        HashMap<Integer, String> personalities = new HashMap<>();
        personalities.put(1, "Sportsfan");
        personalities.put(2, "Extrovert");
        personalities.put(3, "Introvert");
        return personalities;
    }
}
