package com.example.cs210finalproject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.awt.Desktop;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String now = LocalDateTime.now().format(timeFormat);

        if (!file.exists()) {
            file.getParentFile().mkdirs(); // Ensure folders exist
            file.createNewFile();

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("File Path: " + filePath + System.lineSeparator());
                writer.write("Owner: " + ownerUsername + System.lineSeparator());
                writer.write("Created on: " + now + System.lineSeparator());
                writer.write("Last Saved on: " + now + System.lineSeparator());
                writer.write("※ Please remember to save the file (Ctrl + S) before closing." + System.lineSeparator());
                writer.write(System.lineSeparator());
                writer.write("----------------------------------------" + System.lineSeparator());
                writer.write("[Write your content below this line]" + System.lineSeparator());
                writer.write("----------------------------------------" + System.lineSeparator());
                writer.write(System.lineSeparator());

                System.out.println("Created a new File at: " + filePath);
            }

        } else {
            List<String> lines = Files.readAllLines(file.toPath());
            try (FileWriter writer = new FileWriter(file)) {
                for (String line : lines) {
                    if (line.startsWith("Last Saved on:")) {
                        writer.write("Last Saved on: " + now + System.lineSeparator());
                    } else {
                        writer.write(line + System.lineSeparator());
                    }
                }
            }
            System.out.println("Updated Last Saved on: " + now);
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
