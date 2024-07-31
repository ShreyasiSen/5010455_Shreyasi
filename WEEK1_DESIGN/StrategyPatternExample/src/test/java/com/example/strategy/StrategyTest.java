package com.example.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("3456-7654-7893-2635"));
        context.executePayment(100000.32);

        // Paying with PayPal
        context.setPaymentStrategy(new PayPalPayment("shreyasi@yahoo.com"));
        context.executePayment(432000.53);
    }
}
