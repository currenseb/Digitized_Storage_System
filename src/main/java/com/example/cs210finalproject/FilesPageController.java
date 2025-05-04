package com.example.cs210finalproject;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class FilesPageController {

    // Variables
    @FXML
    private TextField overallFileName;

    @FXML
    private TextField topLeftFileName;

    @FXML
    private Button accessTopLeftFileButton;

    // Methods
    @FXML
    protected void onAccessTopLeftFileButtonClick() {
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
    }
}
