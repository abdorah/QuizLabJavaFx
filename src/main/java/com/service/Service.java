package com.service;

import java.util.List;

import com.model.Player;
import com.model.Quiz;

/**
 * <p>
 * Main services implementation class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 4.0
 */

public class Service {

    public static Player player;

    public boolean answerIsCorrect(String question, String answer) {
        for (int i = 0; i < DataLoader.QuestionsAnswersLoader().values().size(); i++) {
            if (question.equals(DataLoader.QuestionsLoader().get(i)) && DataLoader.QuestionsAnswersLoader().get(DataLoader.QuestionsLoader().get(i)).equals(answer)) {
                return true;
            }
        }
        return false;
    }

    public boolean chooseAccount(String name) {
        for (int i = 0; i < DataLoader.PlayersLoader().size(); i++) {
            if (DataLoader.PlayersLoader().get(i).getName().equals(name)) {
                player = DataLoader.PlayersLoader().get(i);
                break;
            }
        }
        if (!player.getName().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public List<Quiz> takeQuiz() {
        return DataLoader.QuizsLoader();
    }

    public String getQuestionByNumber(int questionNumber) {
        return DataLoader.QuestionsLoader().get(questionNumber);
    }

    public String getAnswerByQuestion(String question) {
        return DataLoader.QuestionsAnswersLoader().get(question);
    }

    public String getFirstChoiceByNumber(int questionNumber) {
        return takeQuiz().get(questionNumber).getFirstChoice();
    }

    public String getSecondChoiceByNumber(int questionNumber) {
        return takeQuiz().get(questionNumber).getSecondChoice();
    }

    public String getThirdChoiceByNumber(int questionNumber) {
        return takeQuiz().get(questionNumber).getThirdChoice();
    }

    public void updateScore(String question, String answer) {
        if (answerIsCorrect(question, answer)) {
            player.setHighScore(player.getHighScore() + 1);
            DataLoader.OnePlayUpdater(player, player.getName(), player.getHighScore());
        }
    }

    public Player getPlayerByName(String name) {
        for (int i = 0; i < DataLoader.PlayersLoader().size(); i++) {
            if (DataLoader.PlayersLoader().get(i).getName().equals(name)) {
                player = DataLoader.PlayersLoader().get(i);
                break;
            }
        }
        return player;
    }

    public Player addPlayer(String name) {
        boolean playerAlreadyExist = false;
        for (int i = 0; i < DataLoader.PlayersLoader().size(); i++) {
            if (DataLoader.PlayersLoader().get(i).getName().equals(name)) {
                playerAlreadyExist = true;
            }
        }
        if (!playerAlreadyExist) {            
            return player = DataLoader.AddPlayer(name);
        } else {
            return new Player();
        }
    }

    public boolean updatePlayer(String name) {
        boolean playerUpdated = false;
        for (int i = 0; i < DataLoader.PlayersLoader().size(); i++) {
            if (DataLoader.PlayersLoader().get(i).getName().equals(player.getName())) {
                DataLoader.OnePlayUpdater(player, name, player.getHighScore());
                playerUpdated = true;
                break;
            }
        }
        return playerUpdated;
    }

    public static void main(String[] args) {
        Service s = new Service();
        s.chooseAccount("x");
        s.updatePlayer("name");
    }
}
