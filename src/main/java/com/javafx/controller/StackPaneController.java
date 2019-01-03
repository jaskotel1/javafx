package com.javafx.controller;

import javafx.event.ActionEvent;
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

    public void onActionButton(ActionEvent e) {
        if(e.getSource() instanceof Button) {
            System.out.println("Kliknąłeś button");
        } else {
            System.out.println("Kliknąłeś checkBox");
        }
    }
}
