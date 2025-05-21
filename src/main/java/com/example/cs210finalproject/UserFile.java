package com.example.cs210finalproject;
import java.io.IOException;
import java.io.File;
import java.awt.Desktop;

public class UserFile {
    // Variables

    private String fileName;
    private String filePath;
    private String ownerUsername;

    // Methods

    // Full Constructor
    public UserFile(String fileName, User user) {
        this.fileName = fileName;
        this.ownerUsername = user.getUsername(); // Uses getter from User
        this.filePath = "MainRoot/" + ownerUsername + "/" + fileName + ".txt"; // ensures username is within file path and therefore only this user can access this file
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void openWithDefaultApp() throws IOException {
        File file = new File(filePath); // <-- Use full path
        if (!file.exists()) {
            file.getParentFile().mkdirs(); // Ensure folders exist
            file.createNewFile();
            System.out.println("Created a new File at: " + filePath);
        }
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(file);
        } else {
            System.out.println("Unable to open the file on this system.");
        }
    }

    public boolean deleteFile() {
        File file = new File(filePath); // <-- Use full path
        if (file.exists()) {
            return file.delete();
        } else {
            System.out.println("The file doesn't exist: " + filePath);
            return false;
        }
    }

}
