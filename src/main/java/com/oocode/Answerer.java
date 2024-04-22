package com.oocode;

public class Answerer {
    public String answerFor(String question) {
        if(question.equals("What is your name?")) {
            return "Till S";
        } else if (question.equals("Who is winning?")) {
            return "Always Till";
        } else {
            return "This question is tough. Please ask ChatGPT.";
        }
    }
}
