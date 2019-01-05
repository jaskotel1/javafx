package com.javafx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreenController {

    private MainController mainController;

    @FXML
    public void openApplication() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/ApplicationScreen.fxml"));

        Pane pane = null;
        try {
            pane = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ApplicationController applicationController = fxmlLoader.getController();
        applicationController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    @FXML
    public void openOptions() {

    }

    @FXML
    public void exit() {

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
