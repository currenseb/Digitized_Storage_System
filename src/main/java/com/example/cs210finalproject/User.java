package com.example.cs210finalproject;
import java.util.HashMap;

public class User {

    // user information
    public String username;
    public String password;

    // declares data fields from each individual data class
    public HomePageData homePageData;
    public FilePageData file1Data;
    public FilePageData file2Data;
    public FilePageData file3Data;
    public FilePageData file4Data;
    public FilePageData file5Data;
    public NotificationData notificationData;
    public ProfilePageData profilePageData;

    // Full Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;

        // Initialize all associated data
        this.homePageData = new HomePageData();
        this.notificationData = new NotificationData();
        this.profilePageData = new ProfilePageData();

        this.file1Data = new FilePageData();
        this.file2Data = new FilePageData();
        this.file3Data = new FilePageData();
        this.file4Data = new FilePageData();
        this.file5Data = new FilePageData();
    }

    public String getUsername() {
        return this.username;
    }

    // Static user database using a HashMap. Needs to be static so that way user data can be loaded no matter where they are in the application.
    // Next goal is to put this HashMap onto an online database so that way data can save despite termination of application
    public static HashMap<String, User> userDatabase = new HashMap<>();

    // Static Sign up method
    public static boolean signUp(String username, String password) {
        if (userDatabase.containsKey(username)) {
            return false; // ensures no duplicate users
        }
        userDatabase.put(username, new User(username, password));
        return true;
    }

    // Static Log in method
    public static User logIn(String username, String password) {
        User user = userDatabase.get(username); // loads user data
        if (user != null && user.password.equals(password)) {
            return user;
        }
        return null;
    }
}

