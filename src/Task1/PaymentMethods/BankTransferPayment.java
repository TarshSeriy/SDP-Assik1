package Task1.PaymentMethods;

import Task1.Interfaces.Payment;

public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}
