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
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.cs210finalproject.HomePage.class.getResource("HomePage.fxml"));
        Parent root = fxmlLoader.load();

        // Get the controller and initialize dataModel
        HomePageController controller = fxmlLoader.getController();
        controller.setDataModel(new HomePageData());

        Scene scene = new Scene(root, 360, 375);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
