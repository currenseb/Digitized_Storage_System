package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class FilesPageController {

    // Variables

        // Text Fields
    @FXML
    private TextField overallFileName;

    @FXML
    private TextField topLeftFileName;

    @FXML
    private TextField topMiddleFileName;

    @FXML
    private TextField topRightFileName;

    @FXML
    private TextField middleLeftFileName;

    @FXML
    private TextField middleMiddleFileName;

    @FXML
    private TextField middleRightFileName;

    @FXML
    private TextField bottomLeftFileName;

    @FXML
    private TextField bottomMiddleFileName;

    @FXML
    private TextField bottomRightFileName;

        // Buttons
    @FXML
    private Button accessTopLeftFileButton;

    @FXML
    private Button accessTopMiddleFileButton;

    @FXML
    private Button accessTopRightFileButton;

    @FXML
    private Button accessMiddleLeftFileButton;

    @FXML
    private Button accessMiddleMiddleFileButton;

    @FXML
    private Button accessMiddleRightFileButton;

    @FXML
    private Button accessBottomLeftFileButton;

    @FXML
    private Button accessBottomMiddleFileButton;

    @FXML
    private Button accessBottomRightFileButton;

    @FXML
    private Button homePageButton;

    @FXML
    private Button notificationPageButton;

    @FXML
    private Button profilePageButton;

    @FXML
    private Button logInPageButton;

    @FXML
    private Button signUpPageButton;

    // Methods
    private FilePageData dataModel;

    public void setDataModel(FilePageData model) {
        this.dataModel = model;
        loadDataIntoFields();
    }

    private void loadDataIntoFields() {
        if (dataModel == null) return;

        overallFileName.setText(dataModel.overallFileName);
        topLeftFileName.setText(dataModel.topLeftFileName);
        topMiddleFileName.setText(dataModel.topMiddleFileName);
        topRightFileName.setText(dataModel.topRightFileName);
        middleLeftFileName.setText(dataModel.middleLeftFileName);
        middleMiddleFileName.setText(dataModel.middleMiddleFileName);
        middleRightFileName.setText(dataModel.middleRightFileName);
        bottomLeftFileName.setText(dataModel.bottomLeftFileName);
        bottomMiddleFileName.setText(dataModel.bottomMiddleFileName);
        bottomRightFileName.setText(dataModel.bottomRightFileName);

        if (dataModel == null) {
            System.out.println("loadDataIntoFields: dataModel is null!");
            return;
        }
        topLeftFileName.setText(dataModel.topLeftFileName);
    }

    private void saveDataToModel() {
        if (dataModel == null) return;

        dataModel.overallFileName = overallFileName.getText().trim();
        dataModel.topLeftFileName = topLeftFileName.getText().trim();
        dataModel.topMiddleFileName = topMiddleFileName.getText().trim();
        dataModel.topRightFileName = topRightFileName.getText().trim();
        dataModel.middleLeftFileName = middleLeftFileName.getText().trim();
        dataModel.middleMiddleFileName = middleMiddleFileName.getText().trim();
        dataModel.middleRightFileName = middleRightFileName.getText().trim();
        dataModel.bottomLeftFileName = bottomLeftFileName.getText().trim();
        dataModel.bottomMiddleFileName = bottomMiddleFileName.getText().trim();
        dataModel.bottomRightFileName = bottomRightFileName.getText().trim();
    }

    @FXML
    protected void onAccessTopLeftFileButtonClick() {
        dataModel.topLeftFileName = topLeftFileName.getText().trim();
        String fileName = topLeftFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
        saveDataToModel();
    }

    @FXML
    protected void onAccessTopMiddleFileButtonClick() {
        dataModel.topMiddleFileName = topMiddleFileName.getText().trim();
        String fileName = topMiddleFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessTopRightFileButtonClick() {
        dataModel.topRightFileName = topRightFileName.getText().trim();
        String fileName = topRightFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessMiddleLeftFileButtonClick() {
        dataModel.middleLeftFileName = middleLeftFileName.getText().trim();
        String fileName = middleLeftFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessMiddleMiddleFileButtonClick() {
        dataModel.middleMiddleFileName = middleMiddleFileName.getText().trim();
        String fileName = middleMiddleFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessMiddleRightFileButtonClick() {
        dataModel.middleRightFileName = middleRightFileName.getText().trim();
        String fileName = middleRightFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessBottomLeftFileButtonClick() {
        dataModel.bottomLeftFileName = bottomLeftFileName.getText().trim();
        String fileName = bottomLeftFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessBottomMiddleFileButtonClick() {
        dataModel.bottomMiddleFileName = bottomMiddleFileName.getText().trim();
        String fileName = bottomMiddleFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onAccessBottomRightFileButtonClick() {
        dataModel.bottomRightFileName = bottomRightFileName.getText().trim();
        String fileName = bottomRightFileName.getText().trim();
        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName);
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onHomePageButtonClick() {

        saveDataToModel();
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
    protected void onNotificationPageButtonClick() {

        saveDataToModel();
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
    protected void onProfilePageButtonClick() {

        saveDataToModel();
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

        saveDataToModel();
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

        saveDataToModel();
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
