package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    // variables
    @FXML
    private TextField usernameSignUp;

    @FXML
    private TextField emailSignUp;

    @FXML
    private TextField passwordSignUp;

    @FXML
    private Button signUpButton;

    @FXML
    private Button logInPageButton;

    // Methods
    @FXML
    protected void onSignUpButtonClick() {
    // juancarlos, implement with user data
    }

    @FXML void onLogInPageButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
            Scene scene = new Scene(loader.load(), 250, 350);

            // Get current stage from the button (or any node)
            Stage stage = (Stage) logInPageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

