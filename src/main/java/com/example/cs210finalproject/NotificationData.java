package com.example.cs210finalproject;

public class NotificationData {

    public String reminder1Text;
    public String reminder2Text;
    public String reminder3Text;

    public String reminder1Date;
    public String reminder2Date;
    public String reminder3Date;

    public static class storedNotificationData {
        public static NotificationData notificationData = new NotificationData();
    }


}
