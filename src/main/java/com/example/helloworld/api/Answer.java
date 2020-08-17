package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
    private String answer;
    private int score;

    public Answer() {
    }

    public Answer(String answer, int score) {
        this.answer = answer;
        this.score = score;
    }

    @JsonProperty
    public String getAnswer() {
        return answer;
    }

    @JsonProperty
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @JsonProperty
    public int getScore() {
        return score;
    }

    @JsonProperty
    public void setScore(int score) {
        this.score = score;
    }
}
