package com.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;

import com.model.Player;

/**
 * <p>
 * This test class is the unit test for com.service.Service class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 3.0
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServiceTest {

    List<String> questions;
    HashMap<String, String> questionsAnswers;
    List<Player> players;
    Service service;

    @BeforeAll
    public void setUp() {
        questions = DataLoader.QuestionsLoader();
        questionsAnswers = DataLoader.QuestionsAnswersLoader();
        players = DataLoader.PlayersLoader();
        service = new Service();
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void answerShouldBeCorrect(Integer i) {
        assertTrue(service.answerIsCorrect(questions.get(i), questionsAnswers.get(questions.get(i))));
    }

    @ParameterizedTest
    @ValueSource(strings = {"youssef kotbi"})
    public void playerShouldBeChoosen(String name) {
        assertTrue(service.chooseAccount(name));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void ShouldGetQuestionByNumber(Integer i) {
        assertEquals(service.getQuestionByNumber(i), questions.get(i));
    }

    @ParameterizedTest
    @ValueSource(strings = {"A"})
    public void ShouldGetAnswerByQuestion(String question) {
        assertTrue(questionsAnswers.values().contains(service.getAnswerByQuestion(question)));
    }

    @Test
    public void ShouldCorrectlyUpdateScore() {
        int currentScore = Service.player.getHighScore();
        service.updateScore("A", "A");
        assertEquals(1, currentScore + 1);
        currentScore = Service.player.getHighScore();
        service.updateScore("B", "A");
        assertEquals(1, currentScore);
    }

    @ParameterizedTest
    @ValueSource(strings = {"youssef kotbi"})
    public void ShouldGetPlayerByName(String name) {
        assertEquals(service.getPlayerByName(name).getName(), name);
        assertEquals(service.getPlayerByName(name).getHighScore(), 1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"hajar kotbi"})
    public void ShouldAddPlayer(String name) {
        assertEquals("", service.addPlayer(name).getName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"abderrahmane kotbi"})
    public void ShouldUpdatePlayer(String name) {
        service.getPlayerByName(name);
        assertTrue(service.updatePlayer("youssef kotbi"));
    }
}