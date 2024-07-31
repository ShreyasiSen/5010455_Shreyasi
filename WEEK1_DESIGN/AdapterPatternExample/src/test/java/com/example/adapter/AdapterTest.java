package com.example.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        PaymentGatewayA gatewayA = new PaymentGatewayA();
        PaymentProcessor adapterA = new PaymentGatewayAAdapter(gatewayA);
        adapterA.processPayment(25000.0);

        PaymentGatewayB gatewayB = new PaymentGatewayB();
        PaymentProcessor adapterB = new PaymentGatewayBAdapter(gatewayB);
        adapterB.processPayment(30000.0);
    }
}
