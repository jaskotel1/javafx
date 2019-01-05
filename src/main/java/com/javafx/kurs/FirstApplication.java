package com.javafx.kurs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/MainScreen.fxml"));

        StackPane stackPane = loader.load();

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Flow example");
        primaryStage.show();
    }
}
