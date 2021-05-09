package com.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import com.model.Context;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * <p>
 * The game play layout Controller Class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class GameOnController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button pauseButton;

        @FXML
        private Button submitButton;

        @FXML
        private Label questionText;

        @FXML
        private RadioButton AnswerChoiceOne;

        @FXML
        private RadioButton AnswerChoiceTwo;

        @FXML
        private RadioButton AnswerChoiceFour;

        @FXML
        private RadioButton AnswerChoiceThree;

        @FXML
        void pauseButton(ActionEvent event) throws IOException {
                Main.setRoot("GamePausedPage");
        }

        @FXML
        void submitButton(ActionEvent event) throws IOException {
                if (Context.getInstance().currentQuestionNumber() < Context.getInstance().currentGameService()
                                .takeQuiz().size() - 1) {

                        questionText.setText(Context.getInstance().currentGameService()
                                        .getQuestionByNumber(Context.getInstance().currentQuestionNumber()));

                        Context.getInstance()
                                        .setcurrentQuestionNumber(Context.getInstance().currentQuestionNumber() + 1);

                        if (AnswerChoiceOne.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceOne.getText());
                        }
                        if (AnswerChoiceTwo.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceOne.getText());
                        }
                        if (AnswerChoiceThree.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceOne.getText());
                        }
                        if (AnswerChoiceFour.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceOne.getText());
                        }
                        Main.setRoot("GamePausedPage");
                        if (Context.getInstance().currentQuestionNumber() == Context.getInstance().currentGameService()
                                        .takeQuiz().size() - 1) {
                                submitButton.setText("submit");
                                int random = new Random().nextInt(4);
                                if (random == 0) {
                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                if (random == 1) {
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                if (random == 2) {
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                if (random == 3) {
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                Context.getInstance().reset();
                        } else {
                                int random = new Random().nextInt(4);
                                if (random == 0) {
                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                if (random == 1) {
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                if (random == 2) {
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                                if (random == 3) {
                                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                                        .getQuestionByNumber(Context.getInstance()
                                                                                        .currentQuestionNumber())));
                                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                                        .getFirstChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                                        .getSecondChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                                        .getThirdChoiceByNumber(
                                                                        Context.getInstance().currentQuestionNumber()));
                                }
                        }
                } else {
                        if (AnswerChoiceOne.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceOne.getText());
                        }
                        if (AnswerChoiceTwo.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceTwo.getText());
                        }
                        if (AnswerChoiceThree.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceThree.getText());
                        }
                        if (AnswerChoiceFour.isSelected()) {
                                Context.getInstance().currentGameService().updateScore(questionText.getText(),
                                                AnswerChoiceFour.getText());
                        }
                        Main.setRoot("GamePausedPage");
                }
        }

        @FXML
        void initialize() {
                assert pauseButton != null
                                : "fx:id=\"pauseButton\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                assert submitButton != null
                                : "fx:id=\"submitButton\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                assert questionText != null
                                : "fx:id=\"questionText\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                assert AnswerChoiceOne != null
                                : "fx:id=\"AnswerChoiceOne\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                assert AnswerChoiceTwo != null
                                : "fx:id=\"AnswerChoiceTwo\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                assert AnswerChoiceThree != null
                                : "fx:id=\"AnswerChoiceThree\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                assert AnswerChoiceFour != null
                                : "fx:id=\"AnswerChoiceFour\" was not injected: check your FXML file 'GameOnPage.fxml'.";
                Context.getInstance().setcurrentQuestionNumber(0);
                questionText.setText(Context.getInstance().currentGameService()
                                .getQuestionByNumber(Context.getInstance().currentQuestionNumber()));
                if (Context.getInstance().currentQuestionNumber() == Context.getInstance().currentGameService()
                                .takeQuiz().size() - 1) {
                        submitButton.setText("submit");
                }
                int random = new Random().nextInt(4);
                if (random == 0) {
                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                        .getQuestionByNumber(Context.getInstance()
                                                                        .currentQuestionNumber())));
                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                        .getFirstChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                        .getSecondChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                        .getThirdChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                }
                if (random == 1) {
                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                        .getQuestionByNumber(Context.getInstance()
                                                                        .currentQuestionNumber())));
                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                        .getFirstChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                        .getSecondChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                        .getThirdChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                }
                if (random == 2) {
                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                        .getQuestionByNumber(Context.getInstance()
                                                                        .currentQuestionNumber())));
                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                        .getFirstChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                                                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                        .getSecondChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                        .getThirdChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                }
                if (random == 3) {
                        AnswerChoiceTwo.setText(Context.getInstance().currentGameService()
                                        .getAnswerByQuestion(Context.getInstance().currentGameService()
                                                        .getQuestionByNumber(Context.getInstance()
                                                                        .currentQuestionNumber())));
                        AnswerChoiceFour.setText(Context.getInstance().currentGameService()
                                        .getFirstChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceThree.setText(Context.getInstance().currentGameService()
                                        .getSecondChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                        AnswerChoiceOne.setText(Context.getInstance().currentGameService()
                                        .getThirdChoiceByNumber(
                                                        Context.getInstance().currentQuestionNumber()));
                }
                Context.getInstance().setcurrentQuestionNumber(Context.getInstance().currentQuestionNumber() + 1);
                ToggleGroup toggleGroup = new ToggleGroup();
                AnswerChoiceOne.setToggleGroup(toggleGroup);
                AnswerChoiceTwo.setToggleGroup(toggleGroup);
                AnswerChoiceThree.setToggleGroup(toggleGroup);
                AnswerChoiceFour.setToggleGroup(toggleGroup);
                toggleGroup.selectedToggleProperty().addListener(
                                (observable, oldVal, newVal) -> System.out.println(newVal + " was selected"));
        }
}