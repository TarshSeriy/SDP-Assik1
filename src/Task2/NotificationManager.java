package Task2;

import Task2.Interfaces.Notification;

public class NotificationManager {
    public void sendBulkNotifications(Notification notification, String[] recipients, String message) {
        for (String recipient : recipients) {
            notification.send(message, recipient);
        }
    }
}
