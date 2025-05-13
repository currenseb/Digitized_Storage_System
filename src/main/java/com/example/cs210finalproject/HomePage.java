package com.example.cs210finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HomePage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomePage.class.getResource("HomePage.fxml"));
        Parent root = fxmlLoader.load();

        // Create a test user and pass it to the controller
        User user = new User("default", "default");
        HomePageController controller = fxmlLoader.getController();
        controller.setUser(user);

        Scene scene = new Scene(root, 360, 375);
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

