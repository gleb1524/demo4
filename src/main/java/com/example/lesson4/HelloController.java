package com.example.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    public javafx.scene.control.TextArea textArea;
    public javafx.scene.control.TextField textField;
    @FXML
    private Label welcomeText;

    @FXML
    protected void enterBtn(ActionEvent actionEvent) {

        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}