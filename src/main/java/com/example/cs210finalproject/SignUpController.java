package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    private TextField passwordSignUp;

    @FXML
    private Button signUpButton;

    @FXML
    private Button logInPageButton;

    // Methods

    private boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        String symbols = "!@#$%^&*";
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (symbols.indexOf(c) != -1) {
                count++;
            }
        }

        return count >= 2;
    }



    @FXML
    protected void onSignUpButtonClick() {
        String username = usernameSignUp.getText().trim();
        String password = passwordSignUp.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            return; // Skip if fields are empty
        }

        if (!isValidPassword(password)) {
            return; // Password doesn't meet criteria
        }

        boolean success = User.signUp(username, password);

        if (!success) {
            return; // Username already exists
        }

        // Successfully signed up — get user and go to HomePage
        User newUser = User.userDatabase.get(username);
        newUser.profilePageData.username = username;
        newUser.profilePageData.password = password;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(newUser);

            Stage stage = (Stage) signUpButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onLogInPageButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
            Scene scene = new Scene(loader.load(), 250, 350);
            Stage stage = (Stage) logInPageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

