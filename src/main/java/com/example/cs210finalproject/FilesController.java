package com.example.cs210finalproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesController {

    private final List<UserFile> fileList;

    public FilesController() {
        this.fileList = new ArrayList<>();
    }

    public void openOrCreateFile(String fileName, String ownerUsername) {
        for (UserFile file : fileList) {
            if (file.getFileName().equals(fileName)) {
                try {
                    file.openWithDefaultApp();
                } catch (IOException e) {
                    System.out.println("Error opening existing file: " + fileName);
                    e.printStackTrace();
                }
                return;
            }
        }

        UserFile newFile = new UserFile(fileName, ownerUsername);
        fileList.add(newFile);
        try {
            newFile.openWithDefaultApp();
            System.out.println("Created and opened new file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error creating or opening file: " + fileName);
            e.printStackTrace();
        }
    }

    public boolean deleteFile(String fileName) {
        for (UserFile file : fileList) {
            if (file.getFileName().equals(fileName)) {
                boolean deleted = file.deleteFile();
                if (deleted) fileList.remove(file);
                return deleted;
            }
        }
        return false;
    }

    public List<UserFile> getAllFiles() {
        return fileList;
    }
}