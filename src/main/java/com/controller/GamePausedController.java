package com.controller;

import static com.service.GameClauses.HELP_CLAUSE;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.model.Context;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * <p>
 * The pause layout Controller Class
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.0
 */


public class GamePausedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label InfosDisplay;

    @FXML
    private Button infosButton;

    @FXML
    private Button continueButton;

    @FXML
    private Button helpButton;

    @FXML
    void continueButton(ActionEvent event) throws IOException {
        Main.setRoot("GameOnPage");
    }

    @FXML
    void helpButton(ActionEvent event) {
        InfosDisplay.setText(HELP_CLAUSE.getText());
    }

    @FXML
    void infosButton(ActionEvent event) throws IOException {
        Main.setRoot("PlayerInfoPage");
    }

    @FXML
    void initialize() {
        assert InfosDisplay != null : "fx:id=\"InfosDisplay\" was not injected: check your FXML file 'GamePausedPage.fxml'.";
        assert infosButton != null : "fx:id=\"infosButton\" was not injected: check your FXML file 'GamePausedPage.fxml'.";
        assert continueButton != null : "fx:id=\"continueButton\" was not injected: check your FXML file 'GamePausedPage.fxml'.";
        assert helpButton != null : "fx:id=\"helpButton\" was not injected: check your FXML file 'GamePausedPage.fxml'.";
        if (Context.getInstance().currentQuestionNumber() == Context.getInstance().currentGameService().takeQuiz().size() - 1) {
            continueButton.setText("start");
        }
    }
}
