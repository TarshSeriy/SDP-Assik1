package Task2.Interfaces.NotificationMethods;

import Task2.Interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to"+ recipient + ": " + message);
    }

}
