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

    // ensures user creates a safe password
    // static so profile page can access
    public static boolean isValidPassword(String password) {
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
        // assigns entered text as user information
        String username = usernameSignUp.getText().trim();
        String password = passwordSignUp.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            return; // Skip if fields are empty
        }

        if (!isValidPassword(password)) {
            return; // Password meets security criteria
        }

        boolean success = User.signUp(username, password); // calls static sign up method

        if (!success) {
            return;
        }

        // Successfully signed up, now assign user data and go to HomePage
        User newUser = User.userDatabase.get(username);
        newUser.profilePageData.username = username;
        newUser.profilePageData.password = password;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(newUser); // loads user's data into page

            Stage stage = (Stage) signUpButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // opens log in page if user already has an account
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

