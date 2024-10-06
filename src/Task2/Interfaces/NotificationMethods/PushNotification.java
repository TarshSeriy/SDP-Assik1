package Task2.Interfaces.NotificationMethods;

import Task2.Interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
    }
}
