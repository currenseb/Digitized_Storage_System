package com.example.cs210finalproject;

import java.io.IOException;
import java.io.File;
import java.awt.Desktop;

public class UserFile {
    private String fileName;
    private String filePath;
    private String ownerUsername;

    public UserFile(String fileName, String ownerUsername) {
        this.fileName = fileName;
        this.ownerUsername = ownerUsername;
        this.filePath = "MainRoot/" + ownerUsername + "/" + fileName + ".txt";
    }

    public UserFile(String fileName) {
        this.fileName = fileName;
        this.ownerUsername = "temporary_username";
        this.filePath = "MainRoot/" + ownerUsername + "/" + fileName + ".txt";
    }

    public String getFileName() { return fileName; }
    public String getFilePath() { return filePath; }
    public String getOwnerUsername() { return ownerUsername; }



    public void openWithDefaultApp() throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Created a new File named : " + fileName);
        }
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(file);
        } else {
            System.out.println("Unable to open the file on this system.");
        }
    }

    public boolean deleteFile() {
        File file = new File(fileName);
        if (file.exists()) {
            return file.delete();
        } else {
            System.out.println("The file doesn't exist: " + fileName);
            return false;
        }
    }

    public String createFilePath() {
        this.filePath = "MainRoot/" + ownerUsername + "/" + fileName + ".txt";
        return this.filePath;
    }

}

