package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.IOException;

public class FilesPageController {

    // Variables

    private User currentUser;
    private FilePageData dataModel;

        // Text Fields
    @FXML
    private Label overallFileName;

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

    // setter method to associate current user's data to specific file page
    public void setUser(User user, FilePageData fileData) {
        this.currentUser = user;
        this.dataModel = fileData;
        loadDataIntoFields();
    }

    // loads data
    private void loadDataIntoFields() {
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
    }

    // saves data
    private void saveDataIntoModel() {
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
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = topLeftFileName.getText().trim();
        dataModel.topLeftFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessTopMiddleFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = topMiddleFileName.getText().trim();
        dataModel.topMiddleFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessTopRightFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = topRightFileName.getText().trim();
        dataModel.topRightFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessMiddleLeftFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = middleLeftFileName.getText().trim();
        dataModel.middleLeftFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessMiddleMiddleFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = middleMiddleFileName.getText().trim();
        dataModel.middleMiddleFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessMiddleRightFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = middleRightFileName.getText().trim();
        dataModel.middleRightFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessBottomLeftFileButtonClick() {
        String fileName = bottomLeftFileName.getText().trim();
        dataModel.bottomLeftFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessBottomMiddleFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = bottomMiddleFileName.getText().trim();
        dataModel.bottomMiddleFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onAccessBottomRightFileButtonClick() {
        // puts what user entered into the field then sets and saves into the dataModel
        String fileName = bottomRightFileName.getText().trim();
        dataModel.bottomRightFileName = fileName;

        if (!fileName.isEmpty()) {
            UserFile file = new UserFile(fileName, currentUser);
            // creates file with username integrated into file path
            try {
                file.openWithDefaultApp();
            } catch (Exception e) {
                System.out.println("Failed to open file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        saveDataIntoModel();
    }


    @FXML
    protected void onHomePageButtonClick() {
        saveDataIntoModel(); // makes sure data is saved before leaving page

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(currentUser); // loads user's data into page

            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onNotificationPageButtonClick() {
        saveDataIntoModel(); // makes sure data is saved before leaving page

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationPage.fxml"));
            Parent root = loader.load();

            NotificationController controller = loader.getController();
            controller.setUser(currentUser); // loads user's data into page

            Stage stage = (Stage) notificationPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 350, 450));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onProfilePageButtonClick() {
        saveDataIntoModel(); // makes sure data is saved before leaving page

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilePage.fxml"));
            Parent root = loader.load();

            ProfilePageController controller = loader.getController();
            controller.setUser(currentUser); // loads user's data into page

            Stage stage = (Stage) profilePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onLogInPageButtonClick() {
        saveDataIntoModel(); // makes sure data is saved before leaving page

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
        saveDataIntoModel(); // makes sure data is saved before leaving page

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
