package com.javafx.kurs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FirstWindowWithFewOptions extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        Button button = new Button("Button"); //tworzenie przycisku
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 400, 600); //tworzenie sceny z rozmiarami okna

        primaryStage.setScene(scene);
        primaryStage.setTitle("My first window"); //tytuł okienka

        primaryStage.setWidth(600); //ustawienie szerokości okna
        primaryStage.setHeight(400); //ustawienie wysokości okna

        //primaryStage.setResizable(false); //blokada zmiany rozmiaru okienka
        //primaryStage.setFullScreen(true); //aplikacja w pełnym oknie

        /**Sterowanie miejscem uruchomienia aplikacji*/
        //primaryStage.setX(0);
        //primaryStage.setY(0);

        //primaryStage.initStyle(StageStyle.UNDECORATED); //okienko bez obramowania
        primaryStage.setOpacity(0.5); // ustawienie przezroczystości

        primaryStage.show();
    }
}
