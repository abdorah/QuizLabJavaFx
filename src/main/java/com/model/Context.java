package com.model;

import com.service.Service;

public class Context {
    private final static Context instance = new Context();

    public static Context getInstance() {
        return instance;
    }

    private Player player = new Player();
    private Service service = new Service();
    private int questionNumber;

    public Player currentPlayer() {
        return player;
    }

    public Service currentGameService(){
        return service;
    }

    public int currentQuestionNumber(){
        return questionNumber;
    }

    public void setcurrentQuestionNumber(int currentQuestionNumber){
        questionNumber = currentQuestionNumber;
    }
}