package com.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.model.Context;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * <p>
 * The player information layout Controller Class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class PlayerInfosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label highScoreDisplay;

    @FXML
    private Button exitButton;

    @FXML
    private Label playerNameDisplay;

    @FXML
    private TextField playerNewName;

    @FXML
    private Button newPlayerNameButton;

    @FXML
    void exitButton(ActionEvent event) throws IOException {
        Main.setRoot("BeforePlayPage");
    }

    @FXML
    void newPlayerNameButton(ActionEvent event) {
        if (!playerNewName.getText().isBlank()) {
            Context.getInstance().currentGameService().updatePlayer(playerNewName.getText());
            Context.getInstance().currentPlayer().setName(playerNewName.getText());
            playerNameDisplay.setText("Player name: " + playerNewName.getText());
        }
    }

    @FXML
    void initialize() {
        assert highScoreDisplay != null : "fx:id=\"highScoreDisplay\" was not injected: check your FXML file 'PlayerInfoPage.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'PlayerInfoPage.fxml'.";
        assert playerNameDisplay != null : "fx:id=\"playerNameDisplay\" was not injected: check your FXML file 'PlayerInfoPage.fxml'.";
        assert newPlayerNameButton != null : "fx:id=\"newPlayerNameButton\" was not injected: check your FXML file 'PlayerInfoPage.fxml'.";
        playerNameDisplay.setText(playerNameDisplay.getText() + " " + Context.getInstance().currentPlayer().getName());
        highScoreDisplay.setText(highScoreDisplay.getText() + " " + Context.getInstance().currentPlayer().getHighScore());
    }
}
