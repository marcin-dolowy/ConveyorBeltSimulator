package com.example.transportcegiel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.transportcegiel.HelloApplication.root;

public class LoginController {

    @FXML
    private Label labelStatus;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void login() throws IOException {
        if (txtUserName.getText().equals("admin") && txtPassword.getText().equals("admin")) {
            labelStatus.setText("Login successful.");

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.setTitle("Conveyor Belt Simulator");
            stage.setScene(scene);
            stage.show();
        } else {
            labelStatus.setText("Incorrect username or password.");
        }
    }
}
