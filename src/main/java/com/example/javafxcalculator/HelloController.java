package com.example.javafxcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Label sign;

    @FXML
    private Label output;
    @FXML
    TextField tf1 = new TextField();
    @FXML
    TextField tf2 = new TextField();
    @FXML
    String operator;


    @FXML
    protected void onHelloButtonClick() {
        try {
            if (operator == "+") {
                output.setText(String.valueOf(Double.valueOf(tf1.getText()) + Double.valueOf(tf2.getText())));
            } else if (operator == "-") {
                output.setText(String.valueOf(Double.valueOf(tf1.getText()) - Double.valueOf(tf2.getText())));
            } else if (operator == "*") {
                output.setText(String.valueOf(Double.valueOf(tf1.getText()) * Double.valueOf(tf2.getText())));
            } else if (operator == "/") {
                output.setText(String.valueOf(Double.valueOf(tf1.getText()) / Double.valueOf(tf2.getText())));
            }
        } catch (NumberFormatException e) {
            output.setText("Error");
        }
    }

    @FXML
    protected void setPlus(){
        sign.setText("+");
        operator = "+";
    }

    @FXML
    protected void setMinus(){
        sign.setText("-");
        operator = "-";
    }

    @FXML
    protected void setMultiply(){
        sign.setText("*");
        operator = "*";
    }

    @FXML
    protected void setDivide(){
        sign.setText("/");
        operator = "/";
    }
}