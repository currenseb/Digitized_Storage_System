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
        // assigns entered text as user information
        String username = usernameLogIn.getText().trim();
        String password = passwordLogIn.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            return;
        }

        // calls static log in class and saves data
        User user = User.logIn(username, password);

        // passes data if user exists
        if (user != null) {
            user.profilePageData.username = username;
            user.profilePageData.password = password;
        }

        if (user == null) {
            return;
        }

        // opens home page GUI after a successful log in
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(user); // loads user's data into page

            Stage stage = (Stage) logInPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Sign Up page if user does not have an account
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




