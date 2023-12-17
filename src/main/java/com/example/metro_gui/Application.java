package com.example.metro_gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Класс для gui на javaFx
 */
public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        //Parent root = FXMLLoader.load(Application.class.getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1040, 520);
        stage.setResizable(false);
        stage.setTitle("MetroTrips");
        stage.setScene(scene);
        stage.show();
    }
}