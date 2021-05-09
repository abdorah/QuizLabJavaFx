package com.controller;

import static com.service.GameClauses.HELP_CLAUSE;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * <p>
 * The before starting the game layout Controller Class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class BeforePlayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label helpDisplay;

    @FXML
    private Button startButton;

    @FXML
    private Button helpButton;

    @FXML
    void helpButton(ActionEvent event) {
        helpDisplay.setText(HELP_CLAUSE.getText());
    }

    @FXML
    void startButton(ActionEvent event) throws IOException {
        Main.setRoot("GameOnPage");
    }

    @FXML
    void initialize() {
        assert helpDisplay != null
                : "fx:id=\"helpDisplay\" was not injected: check your FXML file 'BeforePlayPage.fxml'.";
        assert startButton != null
                : "fx:id=\"startButton\" was not injected: check your FXML file 'BeforePlayPage.fxml'.";
        assert helpButton != null
                : "fx:id=\"helpButton\" was not injected: check your FXML file 'BeforePlayPage.fxml'.";
    }
}