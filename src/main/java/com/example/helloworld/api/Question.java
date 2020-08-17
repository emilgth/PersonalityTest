package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Question {
    private String question;
    private List<Answer> answers;

    public Question() {
    }

    public Question(String question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    @JsonProperty
    public String getQuestion() {
        return question;
    }

    @JsonProperty
    public void setQuestion(String question) {
        this.question = question;
    }

    @JsonProperty
    public List<Answer> getAnswers() {
        return answers;
    }

    @JsonProperty
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
