package com.caiocotts.labtestpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        var gridPane = new GridPane();
        var pane = new Pane();
        var hBox = new HBox();
        var vBox = new VBox();


        var number1 = new TextField();
        var number2 = new TextField();
        var errorMessage = new Label();
        var outputField = new Label();

        hBox.getChildren().addAll(number1, number2);

        GridPane.setConstraints(number1, 0, 0);
        GridPane.setConstraints(number2, 1, 0);
        var add = new Button("+");
        add.setOnMouseClicked(_ -> {
            double num1, num2;
            try {
                num1 = Integer.parseInt(number1.getText());
                num2 = Integer.parseInt(number2.getText());

            } catch (Exception _) {
                outputField.setText("Invalid number argument entered");
                return;
            }
            outputField.setText("" + (num1 + num2));
        });

        GridPane.setConstraints(add, 0, 1);

        var subtract = new Button("-");
        subtract.setOnMouseClicked(_ -> {
            double num1, num2;
            try {
                num1 = Integer.parseInt(number1.getText());
                num2 = Integer.parseInt(number2.getText());

            } catch (Exception _) {
                outputField.setText("Invalid number argument entered");
                return;
            }
            outputField.setText("" + (num1 - num2));
        });
        GridPane.setConstraints(subtract, 1, 1);

        var multiply = new Button("*");
        multiply.setOnMouseClicked(_ -> {
            double num1, num2;
            try {
                num1 = Integer.parseInt(number1.getText());
                num2 = Integer.parseInt(number2.getText());

            } catch (Exception _) {
                outputField.setText("Invalid number argument entered");
                return;
            }
            outputField.setText("" + (num1 * num2));
        });

        GridPane.setConstraints(multiply, 2, 1);

        var divide = new Button("/");
        divide.setOnMouseClicked(_ -> {
            double num1, num2;
            try {
                num1 = Integer.parseInt(number1.getText());
                num2 = Integer.parseInt(number2.getText());

            } catch (Exception _) {
                outputField.setText("Invalid number argument entered");
                return;
            }
            outputField.setText("" + (num1 / num2));
        });
        GridPane.setConstraints(divide, 3, 1);


        GridPane.setConstraints(outputField, 0, 2);
        gridPane.getChildren().addAll(add, subtract, multiply, divide);
        vBox.getChildren().addAll(errorMessage, hBox, gridPane, outputField);
        pane.getChildren().addAll(vBox);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
