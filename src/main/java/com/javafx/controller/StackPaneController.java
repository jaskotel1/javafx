package com.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

    @FXML
    private Button button;

    public StackPaneController() {
        System.out.println("Załadowany");
    }

    //metoda uruchamia się zaraz po konstruktorze, tworzy obiekty wszystkich elementów z apki
    @FXML
    void initialize() {

    }
}
