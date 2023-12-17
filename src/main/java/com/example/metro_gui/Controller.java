package com.example.metro_gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер (обязателен для JavaFX)
 */
public class Controller implements Initializable {
    /**
     * Комбобокс в котором содержатся названия станций из которых мы можем отправиться
     */
    public ComboBox<String> metrostart;
    /**
     * Комбобокс в котором содержатся названия станций в которые мы можем отправиться
     */
    public ComboBox<String> metrofinish;
    @FXML
    private Label TEXT; // Текст над кнопкой со временем и маршрутом

    /**
     * Функция, которая срабатывает при нажатии на кнопку
     */
    @FXML
    protected void onButtonClick() {
        TEXT.setText(Dijkstra.count_by_Dijkstra_algoritm(
                Names.get_num_of_station(metrostart.getValue()), Names.get_num_of_station(metrofinish.getValue()))
        );
    }
    /**
     * Функция, которая добавляет названия станций в ComboBox'ы при включении программы
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        metrostart.getItems().setAll(Names.names);
        metrofinish.getItems().setAll(Names.names);
    }
}
