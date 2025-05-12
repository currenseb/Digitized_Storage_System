package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.scene.Parent;
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
// Data Models
    private HomePageData homePageData = HomePageData.StoredHomePageData.homePageData;
    private NotificationData notificationData = NotificationData.storedNotificationData.notificationData;

    public void setDataModel(HomePageData model) {
        this.homePageData = model;
    }

    public void setNotificationData(NotificationData model) {
        this.notificationData = model;
        loadDataIntoFields(); // if you want to load notifications into the fields right away
    }

    private void loadDataIntoFields() {
        reminder1Text.setText(notificationData.reminder1Text);
        reminder2Text.setText(notificationData.reminder2Text);
        reminder3Text.setText(notificationData.reminder3Text);
        reminder1Date.setText(notificationData.reminder1Date);
        reminder2Date.setText(notificationData.reminder2Date);
        reminder3Date.setText(notificationData.reminder3Date);
    }

    private void saveDataToModel() {
        if (reminder1Text != null && reminder1Text.getText() != null)
            notificationData.reminder1Text = reminder1Text.getText().trim();
        else
            notificationData.reminder1Text = "";

        if (reminder2Text != null && reminder2Text.getText() != null)
            notificationData.reminder2Text = reminder2Text.getText().trim();
        else
            notificationData.reminder2Text = "";

        if (reminder3Text != null && reminder3Text.getText() != null)
            notificationData.reminder3Text = reminder3Text.getText().trim();
        else
            notificationData.reminder3Text = "";

        if (reminder1Date != null && reminder1Date.getText() != null)
            notificationData.reminder1Date = "Reminder 1 Set: " + reminder1Date.getText().trim();
        else
            notificationData.reminder1Date = "";

        if (reminder2Date != null && reminder2Date.getText() != null)
            notificationData.reminder2Date = "Reminder 2 Set: " + reminder2Date.getText().trim();
        else
            notificationData.reminder2Date = "";

        if (reminder3Date != null && reminder3Date.getText() != null)
            notificationData.reminder3Date = "Reminder 3 Set: " + reminder3Date.getText().trim();
        else
            notificationData.reminder3Date = "";
    }


    @FXML
    protected void onReminder1ButtonClick() {

        // Creation Of Notification Object
        String text = reminder1Text.getText();
        String date = reminder1Date.getText();
        UserFile reminder1File = new UserFile("reminder1");String file1Path = reminder1File.createFilePath();
        Notification notification1 = new Notification(text, date, file1Path);
        // still waiting to add userName functionality within reminder1File parameters

        saveDataToModel();

    }

    @FXML
    protected void onReminder2ButtonClick() {

        // Creation Of Notification Object
        String text = reminder2Text.getText();
        String date = reminder2Date.getText();
        UserFile reminder2File = new UserFile("reminder2");String file1Path = reminder2File.createFilePath();
        Notification notification2 = new Notification(text, date, file1Path);
        // still waiting to add userName functionality within reminder1File parameters

        saveDataToModel();

    }

    @FXML
    protected void onReminder3ButtonClick() {

        // Creation Of Notification Object
        String text = reminder3Text.getText();
        String date = reminder3Date.getText();
        UserFile reminder3File = new UserFile("reminder3");String file3Path = reminder3File.createFilePath();
        Notification notification3 = new Notification(text, date, file3Path);
        // still waiting to add userName functionality within reminder1File parameters

        saveDataToModel();

    }

    @FXML
    protected void onHomePageButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setDataModel(homePageData);

            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
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
