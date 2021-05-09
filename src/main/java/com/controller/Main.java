package com.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * <p>
 * This is our main class that will launch the application.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 2.0
 */

public class Main extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("WelcomePage"), 640, 480);
        stage.setTitle("Quiz Lab");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("applicationIcon.png")));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        return new FXMLLoader(Main.class.getResource("" + fxml + ".fxml")).load();
    }

    public static void main(String[] args) {
        launch();
    }
}