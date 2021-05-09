package com.service;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Player;
import com.model.Quiz;

/**
 * <p>
 * This test class is the unit test for com.service.DataLoader class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 3.0
 */

public class DataLoaderTest {

    static Stream<Quiz> QuizsProvider() {
        return Stream.of(new Quiz("A", "A", "B", "C", "D"));
    }

    static Stream<String> QuestionsProvider() {
        return Stream.of("A");
    }

    static Stream<String> AnswersProvider() {
        return Stream.of("A");
    }

    static Stream<Player> PlayersProvider() {
        return Stream.of(new Player("hajar kotbi", 0));
    }

    @ParameterizedTest
    @MethodSource("QuestionsProvider")
    public void shouldLoadQuestions(String question) {
        assertTrue(DataLoader.QuestionsLoader().contains(question));
    }

    @ParameterizedTest
    @MethodSource("AnswersProvider")
    public void shouldLoadAnswers(String answer) {
        assertTrue(DataLoader.QuestionsAnswersLoader().containsValue(answer));
    }

    @ParameterizedTest
    @MethodSource("QuizsProvider")
    public void shouldLoadQuizs(Quiz quiz) {
        assertTrue(DataLoader.QuizsLoader().stream().map(p->p.getQuestion()).collect(Collectors.toList()).contains(quiz.getQuestion()));
        assertTrue(DataLoader.QuizsLoader().stream().map(p->p.getAnswer()).collect(Collectors.toList()).contains(quiz.getAnswer()));
        assertTrue(DataLoader.QuizsLoader().stream().map(p->p.getFirstChoice()).collect(Collectors.toList()).contains(quiz.getFirstChoice()));
        assertTrue(DataLoader.QuizsLoader().stream().map(p->p.getSecondChoice()).collect(Collectors.toList()).contains(quiz.getSecondChoice()));
        assertTrue(DataLoader.QuizsLoader().stream().map(p->p.getThirdChoice()).collect(Collectors.toList()).contains(quiz.getThirdChoice()));
    }

    @ParameterizedTest
    @MethodSource("PlayersProvider")
    public void shouldLoadPlayers(Player player) {
        assertTrue(DataLoader.PlayersLoader().stream().map(p->p.getName()).collect(Collectors.toList()).contains(player.getName()));
        assertTrue(DataLoader.PlayersLoader().stream().map(p->p.getHighScore()).collect(Collectors.toList()).contains(player.getHighScore()));
    }

    @ParameterizedTest
    @MethodSource("PlayersProvider")
    public void shouldUpdateOnePlayer(Player player) {        
        assertEquals(DataLoader.OnePlayUpdater(player, "mohamed kotbi", 6).getName(), "mohamed kotbi");
        assertEquals(DataLoader.OnePlayUpdater(player, "mohamed kotbi", 7).getHighScore(), 7);
    }

    @Test
    public void shouldAddPlayer() {
        assertEquals("hajar kotbi", DataLoader.AddPlayer("hajar kotbi").getName());
        assertEquals(0, DataLoader.AddPlayer("hajar kotbi").getHighScore());
    }
}