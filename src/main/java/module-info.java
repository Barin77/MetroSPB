/**
 * Модудь для соединению файла .fxml с программой
 */
module com.example.metro_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metro_gui to javafx.fxml;
    exports com.example.metro_gui;
}