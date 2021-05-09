package com.model;

/**
 * <p>
 * This is the Quiz entity class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.0
 */

public class Quiz {

    String question;
    String Answer;
    String firstChoice;
    String secondChoice;
    String thirdChoice;

    public Quiz() {

    }

    public Quiz(String question, String answer, String firstChoice, String secondChoice, String thirdChoice) {
        this.question = question;
        Answer = answer;
        this.firstChoice = firstChoice;
        this.secondChoice = secondChoice;
        this.thirdChoice = thirdChoice;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getFirstChoice() {
        return firstChoice;
    }

    public void setFirstChoice(String firstChoice) {
        this.firstChoice = firstChoice;
    }

    public String getSecondChoice() {
        return secondChoice;
    }

    public void setSecondChoice(String secondChoice) {
        this.secondChoice = secondChoice;
    }

    public String getThirdChoice() {
        return thirdChoice;
    }

    public void setThirdChoice(String thirdChoice) {
        this.thirdChoice = thirdChoice;
    }

}
