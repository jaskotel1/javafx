package com.javafx.controller;

import javafx.fxml.FXML;

public class ApplicationController {

    private MainController mainController;

    @FXML
    public void backToMenu() {
        mainController.loadMenuScreen();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
