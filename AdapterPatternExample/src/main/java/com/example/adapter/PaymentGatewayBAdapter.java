package com.example.adapter;

public class PaymentGatewayBAdapter implements PaymentProcessor {
    private final PaymentGatewayB gatewayB;

    public PaymentGatewayBAdapter(PaymentGatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    @Override
    public void processPayment(double amount) {
        gatewayB.pay(amount);
    }
}
