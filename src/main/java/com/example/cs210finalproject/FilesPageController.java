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
    private FilePageData dataModel;

    public void setDataModel(FilePageData model) {
        this.dataModel = model;
        loadDataIntoFields();
    }

    private HomePageData homePageDataModel = HomePageData.StoredHomePageData.homePageData;


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

    private void saveDataToModel() {

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

        if (dataModel == FilePageData.StoredFilesPageData.file1) {
            homePageDataModel.file1Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file2) {
            homePageDataModel.file2Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file3) {
            homePageDataModel.file3Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file4) {
            homePageDataModel.file4Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file5) {
            homePageDataModel.file5Name = dataModel.overallFileName;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setDataModel(homePageDataModel);

            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onNotificationPageButtonClick() {
        saveDataToModel();  // saves into FilePageData

        if (dataModel == FilePageData.StoredFilesPageData.file1) {
            HomePageData.StoredHomePageData.homePageData.file1Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file2) {
            HomePageData.StoredHomePageData.homePageData.file2Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file3) {
            HomePageData.StoredHomePageData.homePageData.file3Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file4) {
            HomePageData.StoredHomePageData.homePageData.file4Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file5) {
            HomePageData.StoredHomePageData.homePageData.file5Name = dataModel.overallFileName;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationPage.fxml"));
            Parent root = loader.load();

            NotificationController controller = loader.getController();
            controller.setDataModel(HomePageData.StoredHomePageData.homePageData);
            controller.setNotificationData(NotificationData.storedNotificationData.notificationData);

            Stage stage = (Stage) notificationPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onProfilePageButtonClick() {
        saveDataToModel();  // Save all file text fields into FilePageData

        // ✅ Sync file name into HomePageData before changing scene
        if (dataModel == FilePageData.StoredFilesPageData.file1) {
            HomePageData.StoredHomePageData.homePageData.file1Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file2) {
            HomePageData.StoredHomePageData.homePageData.file2Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file3) {
            HomePageData.StoredHomePageData.homePageData.file3Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file4) {
            HomePageData.StoredHomePageData.homePageData.file4Name = dataModel.overallFileName;
        } else if (dataModel == FilePageData.StoredFilesPageData.file5) {
            HomePageData.StoredHomePageData.homePageData.file5Name = dataModel.overallFileName;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilePage.fxml"));
            Parent root = loader.load();

            ProfilePageController controller = loader.getController();
            controller.setDataModel(HomePageData.StoredHomePageData.homePageData);
            controller.setNotificationData(NotificationData.storedNotificationData.notificationData); // optional

            Stage stage = (Stage) profilePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475));
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
