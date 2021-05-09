package com.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * <p>
 * The Welcome layout Controller Class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class WelcomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startButton;

    @FXML
    void startButton(ActionEvent event) throws IOException {
        Main.setRoot("IdentificationPage");
    }

    @FXML
    void initialize() {
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'WelcomePage.fxml'.";
    }
}