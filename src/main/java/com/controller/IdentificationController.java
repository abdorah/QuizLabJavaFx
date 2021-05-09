package com.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.model.Context;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * <p>
 * The player identification layout Controller Class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class IdentificationController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private RadioButton SignUpRadioButton;

	@FXML
	private RadioButton SignInRadioButton;

	@FXML
	private TextField PlayerName;

	@FXML
	private Button SignInUpButton;

	@FXML
	void SignInUpButton(ActionEvent event) throws IOException {
		String playerName = PlayerName.getText();
		if (SignInRadioButton.isSelected()) {
			if (Context.getInstance().currentGameService().chooseAccount(playerName)) {
				Context.getInstance().currentPlayer().setName(playerName);
				Context.getInstance().currentPlayer().setHighScore(Context.getInstance().currentGameService().getPlayerByName(playerName).getHighScore());
				Main.setRoot("BeforePlayPage");
			}
		} else if (SignUpRadioButton.isSelected()) {
			if (!Context.getInstance().currentGameService().addPlayer(playerName).getName().equals("")) {
				Context.getInstance().currentPlayer().setName(playerName);
				Main.setRoot("BeforePlayPage");
			}
		}
	}

	@FXML
	void initialize() {
		assert SignUpRadioButton != null
				: "fx:id=\"SignUpRadioButton\" was not injected: check your FXML file 'IdentificationPage.fxml'.";
		assert SignInRadioButton != null
				: "fx:id=\"SignInRadioButton\" was not injected: check your FXML file 'IdentificationPage.fxml'.";
		assert PlayerName != null
				: "fx:id=\"PlayerName\" was not injected: check your FXML file 'IdentificationPage.fxml'.";
		assert SignInUpButton != null
				: "fx:id=\"SignInUpButton\" was not injected: check your FXML file 'IdentificationPage.fxml'.";
		ToggleGroup toggleGroup = new ToggleGroup();
		SignUpRadioButton.setToggleGroup(toggleGroup);
		SignInRadioButton.setToggleGroup(toggleGroup);
		SignInRadioButton.setSelected(true);
		toggleGroup.selectedToggleProperty()
				.addListener((observable, oldVal, newVal) -> System.out.println(newVal + " was selected"));
	}
}