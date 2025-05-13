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
        String username = usernameLogIn.getText().trim();
        String password = passwordLogIn.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            return; // Skip if fields are blank
        }

        User user = User.logIn(username, password);
        if (user != null) {
            user.profilePageData.username = username;
            user.profilePageData.password = password;
        }

        if (user == null) {
            return; // Invalid credentials
        }

        // Success — navigate to HomePage with user
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(user);

            Stage stage = (Stage) logInPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Navigate to Sign Up page
    @FXML
    protected void onSignUpPageButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(loader.load(), 250, 350);
            Stage stage = (Stage) signUpPageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }




