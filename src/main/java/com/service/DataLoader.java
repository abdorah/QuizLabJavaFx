package com.service;

import static com.service.SQLClauses.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.model.Player;
import com.model.Quiz;

/**
 * <p>
 * This class will be our main point of communication to the other packages.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 3.1
 */

public class DataLoader {

    public static List<String> QuestionsLoader() {
        Connection connection = null;
        List<String> questions = new ArrayList<String>();
        try {
            Class.forName(DRIVER_CLASS_NAME.getText());
            connection = DriverManager.getConnection(QUIZ_LAB_DB_URL.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_QUESTIONS_CLAUSE.getText());
            while (resultSet.next()) {
                questions.add(resultSet.getString("Question"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return questions;
    }

    public static HashMap<String, String> QuestionsAnswersLoader() {
        Connection connection = null;
        HashMap<String, String> questionsAnswers = new HashMap<String, String>();
        try {
            Class.forName(DRIVER_CLASS_NAME.getText());
            connection = DriverManager.getConnection(QUIZ_LAB_DB_URL.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery((SELECT_QUESTIONS_AND_ANSWERS_CLAUSE.getText()));
            while (resultSet.next()) {
                questionsAnswers.put(resultSet.getString("Question"), resultSet.getString("Answer"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return questionsAnswers;
    }

    public static List<Quiz> QuizsLoader() {
        Connection connection = null;
        List<Quiz> questionsAnswers = new ArrayList<Quiz>();
        try {
            Class.forName(DRIVER_CLASS_NAME.getText());
            connection = DriverManager.getConnection(QUIZ_LAB_DB_URL.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery((SELECT_QUIZS_CLAUSE.getText()));
            while (resultSet.next()) {
                questionsAnswers.add(new Quiz(resultSet.getString("Question"), resultSet.getString("Answer"),
                        resultSet.getString("FirstChoice"), resultSet.getString("SecondChoice"),
                        resultSet.getString("ThirdChoice")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return questionsAnswers;
    }

    public static List<Player> PlayersLoader() {
        Connection connection = null;
        List<Player> players = new ArrayList<Player>();
        try {
            Class.forName(DRIVER_CLASS_NAME.getText());
            connection = DriverManager.getConnection(QUIZ_LAB_DB_URL.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery((SELECT_PLAYERS_CLAUSE.getText()));
            while (resultSet.next()) {
                players.add(new Player(resultSet.getString("playerName"), resultSet.getInt("playerHighScore")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return players;
    }

    public static Player OnePlayUpdater(Player player, String name, int highScore) {
        Connection connection = null;
        try {
            Class.forName(DRIVER_CLASS_NAME.getText());
            connection = DriverManager.getConnection(QUIZ_LAB_DB_URL.getText());
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PLAYER_CLAUSE.getText());
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, highScore);
            preparedStatement.setString(3, player.getName());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        player.setName(name);
        player.setHighScore(highScore);
        return player;
    }

    public static Player AddPlayer(String name) {
        Player player = new Player();
        Connection connection = null;
        try {
            Class.forName(DRIVER_CLASS_NAME.getText());
            connection = DriverManager.getConnection(QUIZ_LAB_DB_URL.getText());
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_PLAYER_CLAUSE.getText());
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        player.setName(name);
        player.setHighScore(0);
        return player;
    }
}
