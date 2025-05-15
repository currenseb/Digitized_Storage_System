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

    private User currentUser;
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

    public void setUser(User user) {
        this.currentUser = user;
        loadDataIntoFields();
    }

    public void loadDataIntoFields() {
        // ✅ Sync latest names from file data into home page data
        currentUser.homePageData.file1Name = currentUser.file1Data.overallFileName;
        currentUser.homePageData.file2Name = currentUser.file2Data.overallFileName;
        currentUser.homePageData.file3Name = currentUser.file3Data.overallFileName;
        currentUser.homePageData.file4Name = currentUser.file4Data.overallFileName;
        currentUser.homePageData.file5Name = currentUser.file5Data.overallFileName;

        // ✅ Now load the synced data into the text fields
        file1Name.setText(currentUser.homePageData.file1Name);
        file2Name.setText(currentUser.homePageData.file2Name);
        file3Name.setText(currentUser.homePageData.file3Name);
        file4Name.setText(currentUser.homePageData.file4Name);
        file5Name.setText(currentUser.homePageData.file5Name);
    }


    public void saveDataIntoModel() {
        if (file1Name != null && file1Name.getText() != null)
            currentUser.homePageData.file1Name = file1Name.getText().trim();
        if (file2Name != null && file2Name.getText() != null)
            currentUser.homePageData.file2Name = file2Name.getText().trim();
        if (file3Name != null && file3Name.getText() != null)
            currentUser.homePageData.file3Name = file3Name.getText().trim();
        if (file4Name != null && file4Name.getText() != null)
            currentUser.homePageData.file4Name = file4Name.getText().trim();
        if (file5Name != null && file5Name.getText() != null)
            currentUser.homePageData.file5Name = file5Name.getText().trim();
    }




    @FXML
    protected void onFile1ButtonClick() {
        // ✅ Step 1: Save current file1 text into user data
        currentUser.file1Data.overallFileName = file1Name.getText().trim();

        try {
            // ✅ Step 2: Load FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File1Page.fxml"));
            Parent root = loader.load();

            // ✅ Step 3: Pass the current user and file1 data into the controller
            FilesPageController controller = loader.getController();
            controller.setUser(currentUser, currentUser.file1Data); // <-- NEW

            // ✅ Step 4: Transition scene
            Stage stage = (Stage) file1Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @FXML
    protected void onFile2ButtonClick() {
        // ✅ Step 1: Save current file1 text into user data
        currentUser.file2Data.overallFileName = file2Name.getText().trim();

        try {
            // ✅ Step 2: Load FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File2Page.fxml"));
            Parent root = loader.load();

            // ✅ Step 3: Pass the current user and file1 data into the controller
            FilesPageController controller = loader.getController();
            controller.setUser(currentUser, currentUser.file2Data); // <-- NEW

            // ✅ Step 4: Transition scene
            Stage stage = (Stage) file2Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onFile3ButtonClick() {
        // ✅ Step 1: Save current file1 text into user data
        currentUser.file3Data.overallFileName = file3Name.getText().trim();

        try {
            // ✅ Step 2: Load FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File3Page.fxml"));
            Parent root = loader.load();

            // ✅ Step 3: Pass the current user and file1 data into the controller
            FilesPageController controller = loader.getController();
            controller.setUser(currentUser, currentUser.file3Data); // <-- NEW

            // ✅ Step 4: Transition scene
            Stage stage = (Stage) file3Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onFile4ButtonClick() {
        // ✅ Step 1: Save current file1 text into user data
        currentUser.file4Data.overallFileName = file4Name.getText().trim();

        try {
            // ✅ Step 2: Load FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File4Page.fxml"));
            Parent root = loader.load();

            // ✅ Step 3: Pass the current user and file1 data into the controller
            FilesPageController controller = loader.getController();
            controller.setUser(currentUser, currentUser.file4Data); // <-- NEW

            // ✅ Step 4: Transition scene
            Stage stage = (Stage) file4Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onFile5ButtonClick() {
        // ✅ Step 1: Save current file1 text into user data
        currentUser.file5Data.overallFileName = file5Name.getText().trim();

        try {
            // ✅ Step 2: Load FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("File5Page.fxml"));
            Parent root = loader.load();

            // ✅ Step 3: Pass the current user and file1 data into the controller
            FilesPageController controller = loader.getController();
            controller.setUser(currentUser, currentUser.file5Data); // <-- NEW

            // ✅ Step 4: Transition scene
            Stage stage = (Stage) file5Button.getScene().getWindow();
            stage.setScene(new Scene(root, 450, 425));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onProfilePageButtonClick() {
        saveDataIntoModel(); // ✅ Save current form into user model before leaving

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilePage.fxml"));
            Parent root = loader.load();

            ProfilePageController controller = loader.getController();
            controller.setUser(currentUser); // ✅ Pass the current user

            Stage stage = (Stage) profilePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 425, 475)); // Adjust size as needed
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    protected void onNotificationPageButtonClick() {
        saveDataIntoModel();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationPage.fxml"));
            Parent root = loader.load();

            NotificationController controller = loader.getController();
            controller.setUser(currentUser);

            Stage stage = (Stage) notificationPageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 350, 450));
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
            Scene scene = new Scene(loader.load(), 250, 350);

            Stage stage = (Stage) signUpPageButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
