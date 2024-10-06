package Task1.PaymentMethods;

import Task1.Interfaces.Payment;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing PayPal payment of $"+ amount);
    }

}