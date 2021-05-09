package com.service;

/**
 * <p>
 * This enum consists of all the messages displayed in this application.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 0.1
 */

public enum GameClauses {
    HELP_CLAUSE("Hello and welcome into QuizLab! This is the help panel.\n"
    + "To use this application all what you have to do is to pick\n"
    + "one choice that you will find on your display.\n"
    + "The application user interface is simple and intuitive.\n"
    + "You need only to choose an option on the application page.\n"
    + "Finally, Questions take only one answer.\n");

    String Text;
    private GameClauses(String text) {
        Text = text;
    }

    public String getText() {
        return Text;
    }
}
