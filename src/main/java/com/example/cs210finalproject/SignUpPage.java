package com.example.cs210finalproject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Base Sign Up Page GUI
// Start Application From Here To Ensure Every Feature Works
public class SignUpPage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SignUpPage.class.getResource("SignUp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 250, 350);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}