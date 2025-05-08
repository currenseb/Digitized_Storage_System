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
import javafx.scene.Parent;

public class HomePageController {

    // Variables
    @FXML
    private TextField file1Name;

    @FXML
    private TextField file2Name;

    @FXML
    private TextField file3Name;

    @FXML
    private TextField file4Name;

    @FXML
    private TextField file5Name;

    @FXML
    private Button file1Button;

    @FXML
    private Button file2Button;

    @FXML
    private Button file3Button;

    @FXML
    private Button file4Button;

    @FXML
    private Button file5Button;

    @FXML
    private Button profilePageButton;

    @FXML
    private Button notificationPageButton;

    @FXML
    private Button logInPageButton;

    @FXML
    private Button signUpPageButton;

    // Methods
    @FXML
    protected void onFile1ButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File1Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(FilePageData.StoredFilesPageData.file1);

            Stage stage = (Stage) file1Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onFile2ButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File2Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(FilePageData.StoredFilesPageData.file2);

            Stage stage = (Stage) file2Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onFile3ButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File3Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(FilePageData.StoredFilesPageData.file3);

            Stage stage = (Stage) file3Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onFile4ButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File4Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(FilePageData.StoredFilesPageData.file4);

            Stage stage = (Stage) file4Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onFile5ButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File5Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(FilePageData.StoredFilesPageData.file5);

            Stage stage = (Stage) file5Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
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
    protected void onNotificationPageButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationPage.fxml"));
            Scene scene = new Scene(loader.load(), 425, 475);

            // Get current stage from the button (or any node)
            Stage stage = (Stage) notificationPageButton.getScene().getWindow();
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
