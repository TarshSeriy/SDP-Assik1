package Task1;

import Task1.Interfaces.Payment;

public class PaymentProcessor {
    public void process(Payment payment, double amount){
        payment.processPayment(amount);
    }
}
