package com.example.adapter;

public class PaymentGatewayAAdapter implements PaymentProcessor {
    private final PaymentGatewayA gatewayA;

    public PaymentGatewayAAdapter(PaymentGatewayA gatewayA) {
        this.gatewayA = gatewayA;
    }

    @Override
    public void processPayment(double amount) {
        gatewayA.makePayment(amount);
    }
}
