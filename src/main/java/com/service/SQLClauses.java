package com.service;

/**
 * <p>
 * This enum consists of all the sql queries used in this application.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.0
 */

public enum SQLClauses {
    QUIZ_LAB_DB_URL("jdbc:sqlite:src/main/resources/com/database/QuizLab.db"),
    DRIVER_CLASS_NAME("org.sqlite.JDBC"),
    SELECT_PLAYERS_CLAUSE("SELECT * FROM PLAYERS;"),
    SELECT_QUESTIONS_CLAUSE("SELECT Question FROM Quizs;"),
    SELECT_QUESTIONS_AND_ANSWERS_CLAUSE("SELECT Question, Answer FROM Quizs;"),
    SELECT_QUIZS_CLAUSE("SELECT * FROM Quizs;"),
    UPDATE_PLAYER_CLAUSE("UPDATE Players SET playerName=?, playerHighScore=? WHERE playerName=?;"),
    INSERT_NEW_PLAYER_CLAUSE("INSERT INTO Players (playerName, playerHighScore) VALUES(?, 0);");
        
    String Text;
    private SQLClauses(String text) {
            Text = text;
        }

    public String getText() {
        return Text;
    }
}
