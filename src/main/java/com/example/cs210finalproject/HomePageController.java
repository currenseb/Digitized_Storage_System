package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
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

    private HomePageData dataModel = HomePageData.StoredHomePageData.homePageData;

    public void setDataModel(HomePageData model) {
        System.out.println("✅ HomePage setDataModel called");
        System.out.println("file1Name = " + model.file1Name);
        this.dataModel = model;
        loadDataIntoFields();
    }

    public void loadDataIntoFields() {

        file1Name.setText(dataModel.file1Name);
        file2Name.setText(dataModel.file2Name);
        file3Name.setText(dataModel.file3Name);
        file4Name.setText(dataModel.file4Name);
        file5Name.setText(dataModel.file5Name);
    }

    public void saveDataIntoModel() {
        if (file1Name != null && file1Name.getText() != null)
            dataModel.file1Name = file1Name.getText().trim();
        if (file2Name != null && file2Name.getText() != null)
            dataModel.file2Name = file2Name.getText().trim();
        if (file3Name != null && file3Name.getText() != null)
            dataModel.file3Name = file3Name.getText().trim();
        if (file4Name != null && file4Name.getText() != null)
            dataModel.file4Name = file4Name.getText().trim();
        if (file5Name != null && file5Name.getText() != null)
            dataModel.file5Name = file5Name.getText().trim();
    }



    @FXML
    protected void onFile1ButtonClick() {
        String name = file1Name.getText().trim();
        FilePageData file1Data = FilePageData.StoredFilesPageData.file1;

        // 🔄 Save text from HomePage text field into file1 data
        file1Data.overallFileName = name;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File1Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(file1Data);  // Send it to file page

            Stage stage = (Stage) file1Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    protected void onFile2ButtonClick() {
        String name = file2Name.getText().trim();
        FilePageData file2Data = FilePageData.StoredFilesPageData.file2;

        file2Data.overallFileName = name;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File2Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(file2Data);

            Stage stage = (Stage) file2Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onFile3ButtonClick() {
        String name = file3Name.getText().trim();
        FilePageData file3Data = FilePageData.StoredFilesPageData.file3;

        file3Data.overallFileName = name;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File3Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(file3Data);

            Stage stage = (Stage) file3Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onFile4ButtonClick() {
        String name = file4Name.getText().trim();
        FilePageData file4Data = FilePageData.StoredFilesPageData.file4;

        file4Data.overallFileName = name;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File4Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(file4Data);

            Stage stage = (Stage) file4Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onFile5ButtonClick() {
        String name = file5Name.getText().trim();
        FilePageData file5Data = FilePageData.StoredFilesPageData.file5;

        file5Data.overallFileName = name;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File5Page.fxml"));
            Parent root = loader.load();

            FilesPageController controller = loader.getController();
            controller.setDataModel(file5Data);

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
            Parent root = loader.load();

            ProfilePageController controller = loader.getController();
            controller.setDataModel(dataModel);  // ✅ pass current HomePageData

            Stage stage = (Stage) profilePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void onNotificationPageButtonClick() {
        saveDataIntoModel();  // ✅ Save before switching scenes

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationPage.fxml"));
            Parent root = loader.load();

            NotificationController controller = loader.getController();

            // ✅ Set both data models
            controller.setDataModel(HomePageData.StoredHomePageData.homePageData);
            controller.setNotificationData(NotificationData.storedNotificationData.notificationData);

            Stage stage = (Stage) notificationPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 350, 450));
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
        saveDataIntoModel();
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
        saveDataIntoModel();
    }
}
