package com.example.cs210finalproject;

public class Notification {

    // Instance Variables
    private String reminderText = "";
    private String reminderDate = "";
    private String reminderFilePath = "";

    // Full Constructor
    public Notification(String reminderText, String reminderDate, String reminderFilePath) {
        this.reminderText = reminderText;
        this.reminderDate = reminderDate;
        this.reminderFilePath = reminderFilePath;
    }

    // Getters
    public String getReminderText() {
        return reminderText;
    }

    public String getReminderDate() {
        return reminderDate;
    }

    public String getReminderFilePath() {
        return reminderFilePath;
    }

    // Setters
    public void setReminderText(String reminderText) {
        this.reminderText = reminderText;
    }

    public void setReminderDate(String reminderDate) {
        this.reminderDate = reminderDate;
    }

    public void setReminderFilePath(String reminderFilePath) {
        this.reminderFilePath = reminderFilePath;
    }

    // toString class
    @Override
    public String toString() {
        return "Notification{" + "reminderText='" + reminderText + '\'' + ", reminderDate='" + reminderDate + '\'' + ", reminderFilePath='" + reminderFilePath + '\'' + '}';
    }


}

