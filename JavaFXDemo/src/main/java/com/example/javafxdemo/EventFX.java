package com.example.javafxdemo;

import java.net.URL;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class EventFX extends Application {
    Button b;
    int count = 0;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader ld = new FXMLLoader();
        ld.setLocation(new URL("FXMLTest.fxml"));
        VBox vb = ld.<VBox>load();


        Scene sc = new Scene(vb, 400, 400);
        stage.setScene(sc);
        stage.show();

    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
