
import Task1.Interfaces.Payment;
import Task1.PaymentMethods.BankTransferPayment;
import Task1.PaymentMethods.CreditCardPayment;
import Task1.PaymentMethods.PayPalPayment;
import Task1.PaymentProcessor;
import Task2.*;
import Task2.Interfaces.Notification;
import Task2.Interfaces.NotificationMethods.EmailNotification;
import Task2.Interfaces.NotificationMethods.PushNotification;
import Task2.Interfaces.NotificationMethods.SMSNotification;

public class Main{
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        NotificationManager notificationManager = new NotificationManager();

        Payment creditCardPayment = new CreditCardPayment();
        paymentProcessor.process(creditCardPayment, 100.0);

        Payment paypalPayment = new PayPalPayment();
        paymentProcessor.process(paypalPayment, 200.0);

        Payment bankTransferPayment = new BankTransferPayment();
        paymentProcessor.process(bankTransferPayment, 300.0);

        Notification sms = new SMSNotification();
        String[] smsRecipients = {"123-456", "098-765"};
        notificationManager.sendBulkNotifications(sms, smsRecipients, "Hello via SMS");

        Notification email = new EmailNotification();
        String[] emailRecipients = {"email1@example.com", "email2@example.com"};
        notificationManager.sendBulkNotifications(email, emailRecipients, "Hello via Email" );

        Notification push = new PushNotification();
        String[] pushRecipients = {"user1", "user2"};
        notificationManager.sendBulkNotifications(push, pushRecipients, "Hello via Push Notification");




    }
}