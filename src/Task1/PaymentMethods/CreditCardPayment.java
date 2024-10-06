package Task1.PaymentMethods;

import Task1.Interfaces.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $"+ amount);
    }
}
