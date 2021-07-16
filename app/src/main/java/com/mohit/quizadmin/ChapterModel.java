package com.mohit.quizadmin;

public class ChapterModel {

    private String quesID;
    private String question;


    public ChapterModel(String quesID, String question) {
        this.quesID = quesID;
        this.question = question;

    }

    public String getQuesID() {
        return quesID;
    }

    public void setQuesID(String quesID) {
        this.quesID = quesID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
