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

    public User currentUser; // Only Public For Internal Unit Testing, otherwise private

    @FXML
    public TextField userUsername; // Only Public For Internal Unit Testing, otherwise private

    @FXML
    public TextField newUserUsername; // Only Public For Internal Unit Testing, otherwise private

    @FXML
    public TextField userPassword; // Only Public For Internal Unit Testing, otherwise private

    @FXML
    public TextField newUserPassword; // Only Public For Internal Unit Testing, otherwise private

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

    // set user method
    public void setUser(User user) {
        this.currentUser = user;
        loadDataIntoFields();
    }

    private void loadDataIntoFields() {
        userUsername.setText("••••••••"); // loads "••••••••" for privacy
        userPassword.setText("••••••••"); // loads "••••••••" for privacy
    }

    @FXML
    protected void onRevealUsernameButtonClick() {
        userUsername.setText(currentUser.profilePageData.username);
    }

    @FXML
    public void onChangeUsernameButtonClick() { // Only Public For Internal Unit Testing, otherwise private
        String newUsername = newUserUsername.getText().trim(); // assigns what user entered into text field as new username
        if (!newUsername.isEmpty()) {
            String oldUsername = currentUser.username;

            // Update user fields
            currentUser.profilePageData.username = newUsername;
            currentUser.username = newUsername;

            // Update the userDatabase key
            User user = User.userDatabase.remove(oldUsername); // remove old hashmap key
            User.userDatabase.put(newUsername, user); // add new hashmap key

            // for privacy
            userUsername.setText("••••••••");
            newUserUsername.clear();
        }
    }


    @FXML
    protected void onRevealPasswordButtonClick() {
        userPassword.setText(currentUser.profilePageData.password);
    }

    @FXML
    public void onChangePasswordButtonClick() { // Only Public For Internal Unit Testing, otherwise private
        String newPassword = newUserPassword.getText().trim(); // assigns what user entered into text field as new password
        if (!newPassword.isEmpty() && SignUpController.isValidPassword(newPassword)) {
            currentUser.profilePageData.password = newPassword;
            currentUser.password = newPassword;

            // for privacy
            userPassword.setText("••••••••");
            newUserPassword.clear();
        }
    }


    @FXML
    protected void onHomePageButtonClick() {
        // no saveDataIntoModel method becuase the only thing changed is saved when clicking change password or username

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = loader.load();

            HomePageController controller = loader.getController();
            controller.setUser(currentUser); // loads user's data into page

            Stage stage = (Stage) homePageButton.getScene().getWindow();
            stage.setScene(new Scene(root, 360, 375)); // Adjust if needed
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onNotificationPageButtonClick() {
        // no saveDataIntoModel method becuase the only thing changed is saved when clicking change password or username

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
    protected void onLogInPageButtonClick() {
        // no saveDataIntoModel method becuase the only thing changed is saved when clicking change password or username

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
        // no saveDataIntoModel method becuase the only thing changed is saved when clicking change password or username

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

    // Only used for unit testing — bypasses JavaFX fields
    public void changeUsernameForTest(String newUsername) {
        if (!newUsername.isEmpty()) {
            String oldUsername = currentUser.username;
            currentUser.profilePageData.username = newUsername;
            currentUser.username = newUsername;

            User updated = User.userDatabase.remove(oldUsername);
            User.userDatabase.put(newUsername, updated);
        }
    }

    // Only used for unit testing — bypasses JavaFX fields
    public void changePasswordForTest(String newPassword) {
        if (!newPassword.isEmpty()) {
            currentUser.profilePageData.password = newPassword;
            currentUser.password = newPassword;
        }
    }


}
