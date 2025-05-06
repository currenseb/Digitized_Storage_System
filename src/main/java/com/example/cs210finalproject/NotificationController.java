package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class NotificationController {

    // Variables
    @FXML
    private TextField reminder1Text;

    @FXML
    private TextField reminder2Text;

    @FXML
    private TextField reminder3Text;

    @FXML
    private TextField reminder1Date;

    @FXML
    private TextField reminder2Date;

    @FXML
    private TextField reminder3Date;

    @FXML
    private Button reminder1Button;

    @FXML
    private Button reminder2Button;

    @FXML
    private Button reminder3Button;

    @FXML
    private Button homePageButton;

    @FXML
    private Button profilePageButton;

    @FXML
    private Button logInPageButton;

    @FXML
    private Button signUpPageButton;

    // Methods
    @FXML
    protected void onReminder1ButtonClick() {

        // Creation Of Notification Object
        String text = reminder1Text.getText();
        String date = reminder1Date.getText();
        UserFile reminder1File = new UserFile("reminder1");String file1Path = reminder1File.createFilePath();
        Notification notification1 = new Notification(text, date, file1Path);
        // still waiting to add userName functionality within reminder1File parameters

    }

    @FXML
    protected void onReminder2ButtonClick() {

        // Creation Of Notification Object
        String text = reminder2Text.getText();
        String date = reminder2Date.getText();
        UserFile reminder2File = new UserFile("reminder2");String file1Path = reminder2File.createFilePath();
        Notification notification2 = new Notification(text, date, file1Path);
        // still waiting to add userName functionality within reminder1File parameters

    }

    @FXML
    protected void onReminder3ButtonClick() {

        // Creation Of Notification Object
        String text = reminder3Text.getText();
        String date = reminder3Date.getText();
        UserFile reminder3File = new UserFile("reminder3");String file3Path = reminder3File.createFilePath();
        Notification notification3 = new Notification(text, date, file3Path);
        // still waiting to add userName functionality within reminder1File parameters

    }

    @FXML
    protected void onHomePageButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Scene scene = new Scene(loader.load(), 360, 375);

            // Get current stage from the button (or any node)
            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onProfilePageButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilePage.fxml"));
            Scene scene = new Scene(loader.load(), 425, 475);

            // Get current stage from the button (or any node)
            Stage stage = (Stage) profilePageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onLogInPageButtonClick() {

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
