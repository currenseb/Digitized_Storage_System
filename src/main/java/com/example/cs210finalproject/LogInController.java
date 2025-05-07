package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController {

    // Variables
    @FXML
    private TextField usernameLogIn;

    @FXML
    private TextField passwordLogIn;

    @FXML
    private Button logInPageButton;

    @FXML
    private Button signUpPageButton;

    // Methods
    @FXML
    protected void onLogInPageButtonClick() {
    // juancarlos, implement with user data and whatnot
    }

    @FXML
    protected void onSignUpPageButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(loader.load(), 360, 375);

            // Get current stage from the button (or any node)
            Stage stage = (Stage) signUpPageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }




