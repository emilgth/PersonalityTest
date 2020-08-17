package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalityType {
    private String type;
    private int score;

    public PersonalityType() {
    }

    public PersonalityType(String type, int score) {
        this.type = type;
        this.score = score;
    }

    @JsonProperty
    public String getType() {
        return type;
    }

    @JsonProperty
    public void setType(String type) {
        this.type = type;
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
