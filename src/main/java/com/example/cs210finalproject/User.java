package com.example.cs210finalproject;

import java.util.HashMap;

public class User {

    public String username;
    public String password;

    public HomePageData homePageData;
    public FilePageData file1Data;
    public FilePageData file2Data;
    public FilePageData file3Data;
    public FilePageData file4Data;
    public FilePageData file5Data;
    public NotificationData notificationData;
    public ProfilePageData profilePageData;

    // Constructor
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

    // Static user database
    public static HashMap<String, User> userDatabase = new HashMap<>();

    // Sign up method
    public static boolean signUp(String username, String password) {
        if (userDatabase.containsKey(username)) return false;
        userDatabase.put(username, new User(username, password));
        return true;
    }

    // Log in method
    public static User logIn(String username, String password) {
        User user = userDatabase.get(username);
        if (user != null && user.password.equals(password)) {
            return user;
        }
        return null;
    }
}

