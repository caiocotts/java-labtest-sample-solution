package com.caiocotts.labtestpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    final static TextField number1 = new TextField();
    final static TextField number2 = new TextField();
    final static Label outputField = new Label();

    @Override
    public void start(Stage stage) {
        var pane = new Pane();
        var textFields = new HBox();
        var buttons = new HBox();
        var vBox = new VBox();

        textFields.getChildren().addAll(number1, number2);

        var add = new Button("+");
        add.setOnMouseClicked(_ -> calculate("+"));

        var subtract = new Button("-");
        subtract.setOnMouseClicked(_ -> calculate("-"));

        var multiply = new Button("*");
        multiply.setOnMouseClicked(_ -> calculate("*"));

        var divide = new Button("/");
        divide.setOnMouseClicked(_ -> calculate("/"));

        GridPane.setConstraints(outputField, 0, 2);

        buttons.getChildren().addAll(add, subtract, multiply, divide);
        vBox.getChildren().addAll(textFields, buttons, outputField);
        pane.getChildren().addAll(vBox);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private static void calculate(String op) {
        double num1, num2;
        try {
            num1 = Double.parseDouble(number1.getText());
            num2 = Double.parseDouble(number2.getText());

        } catch (Exception _) {
            outputField.setText("Invalid number argument entered");
            return;
        }

        switch (op) {
            case "+":
                outputField.setText("" + (num1 + num2));
                break;
            case "-":
                outputField.setText("" + (num1 - num2));
                break;
            case "*":
                outputField.setText("" + (num1 * num2));
                break;
            case "/":
                outputField.setText("" + (num1 / num2));
                break;
        }
    }
}
