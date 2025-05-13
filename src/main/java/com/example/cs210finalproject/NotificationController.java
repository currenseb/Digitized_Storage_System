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

    private User currentUser;
    private NotificationData dataModel;

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

    public void setUser(User user) {
        this.currentUser = user;
        this.dataModel = user.notificationData;
        loadDataIntoFields();
    }

    private void loadDataIntoFields() {
        reminder1Text.setText(dataModel.reminder1Text);
        reminder1Date.setText(dataModel.reminder1Date);
        reminder2Text.setText(dataModel.reminder2Text);
        reminder2Date.setText(dataModel.reminder2Date);
        reminder3Text.setText(dataModel.reminder3Text);
        reminder3Date.setText(dataModel.reminder3Date);
    }

    private void saveDataIntoModel() {
        if (reminder1Text != null && reminder1Text.getText() != null)
            dataModel.reminder1Text = reminder1Text.getText().trim();
        else
            dataModel.reminder1Text = "";

        if (reminder2Text != null && reminder2Text.getText() != null)
            dataModel.reminder2Text = reminder2Text.getText().trim();
        else
            dataModel.reminder2Text = "";

        if (reminder3Text != null && reminder3Text.getText() != null)
            dataModel.reminder3Text = reminder3Text.getText().trim();
        else
            dataModel.reminder3Text = "";

        if (reminder1Date != null && reminder1Date.getText() != null)
            dataModel.reminder1Date = reminder1Date.getText().trim();
        else
            dataModel.reminder1Date = "";

        if (reminder2Date != null && reminder2Date.getText() != null)
            dataModel.reminder2Date = reminder2Date.getText().trim();
        else
            dataModel.reminder2Date = "";

        if (reminder3Date != null && reminder3Date.getText() != null)
            dataModel.reminder3Date = reminder3Date.getText().trim();
        else
            dataModel.reminder3Date = "";
    }



    @FXML
    protected void onReminder1ButtonClick() {
        // ✅ Safely save the reminder text and date into the user’s model
        if (reminder1Text != null && reminder1Text.getText() != null)
            dataModel.reminder1Text = reminder1Text.getText().trim();
        else
            dataModel.reminder1Text = "";

        if (reminder1Date != null && reminder1Date.getText() != null)
            dataModel.reminder1Date = reminder1Date.getText().trim();
        else
            dataModel.reminder1Date = "";
    }



    @FXML
    protected void onReminder2ButtonClick() {
        // ✅ Safely save the reminder text and date into the user’s model
        if (reminder2Text != null && reminder2Text.getText() != null)
            dataModel.reminder2Text = reminder2Text.getText().trim();
        else
            dataModel.reminder2Text = "";

        if (reminder2Date != null && reminder2Date.getText() != null)
            dataModel.reminder2Date = reminder2Date.getText().trim();
        else
            dataModel.reminder2Date = "";
    }


    @FXML
    protected void onReminder3ButtonClick() {
        // ✅ Safely save the reminder text and date into the user’s model
        if (reminder3Text != null && reminder3Text.getText() != null)
            dataModel.reminder3Text = reminder3Text.getText().trim();
        else
            dataModel.reminder3Text = "";

        if (reminder3Date != null && reminder3Date.getText() != null)
            dataModel.reminder3Date = reminder3Date.getText().trim();
        else
            dataModel.reminder3Date = "";
    }


    @FXML
    protected void onHomePageButtonClick() {
        saveDataIntoModel();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(currentUser);

            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375)); // Adjust if needed
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onProfilePageButtonClick() {
        saveDataIntoModel();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilePage.fxml"));
            Parent root = loader.load();

            ProfilePageController controller = loader.getController();
            controller.setUser(currentUser);

            Stage stage = (Stage) profilePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onLogInPageButtonClick() {
        saveDataIntoModel();

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


    @FXML
    protected void onSignUpPageButtonClick() {
        saveDataIntoModel();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(loader.load(), 360, 375);

            Stage stage = (Stage) signUpPageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
