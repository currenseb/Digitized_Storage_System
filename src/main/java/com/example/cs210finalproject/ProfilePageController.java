package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import jdk.incubator.vector.VectorOperators;

import java.io.IOException;

public class ProfilePageController {

    // Variables
    @FXML
    private TextField userEmail;

    @FXML
    private TextField newUserEmail;

    @FXML
    private TextField userUsername;

    @FXML
    private TextField newUserUsername;

    @FXML
    private TextField userPassword;

    @FXML
    private TextField newUserPassword;

    @FXML
    private Button revealEmailButton;

    @FXML
    private Button changeEmailButton;

    @FXML
    private Button revealUsernameButton;

    @FXML
    private Button changeUsernameButton;

    @FXML
    private Button revealPasswordButton;

    @FXML
    private Button changePasswordButton;

    @FXML
    private Button homePageButton;

    @FXML
    private Button logInPageButton;

    @FXML
    private Button signUpPageButton;

    @FXML
    private Button notificationPageButton;

    // Methods

    private HomePageData dataModel = HomePageData.StoredHomePageData.homePageData;
    private NotificationData notificationData = NotificationData.storedNotificationData.notificationData;

    public void setDataModel(HomePageData model) {
        this.dataModel = model;
    }

    public void setNotificationData(NotificationData model) {
        this.notificationData = model;
    }


    @FXML
    protected void onRevealEmailButtonClick() {

    }

    @FXML
    protected void onChangeEmailButtonClick() {

    }

    @FXML
    protected void onRevealUsernameButtonClick() {

    }

    @FXML
    protected void onChangeUsernameButtonClick() {

    }

    @FXML
    protected void onRevealPasswordButtonClick() {

    }

    @FXML
    protected void onChangePasswordButtonClick() {

    }

    @FXML
    protected void onHomePageButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setDataModel(dataModel);  // ✅ reusing the passed-in model

            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onNotificationPageButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationPage.fxml"));
            Parent root = loader.load();

            NotificationController controller = loader.getController();
            controller.setDataModel(dataModel);  // ✅ HomePageData
            controller.setNotificationData(notificationData);  // ✅ NotificationData

            Stage stage = (Stage) notificationPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475));
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
