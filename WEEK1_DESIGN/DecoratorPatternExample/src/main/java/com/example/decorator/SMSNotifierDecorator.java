package com.example.decorator;

public class SMSNotifierDecorator extends NotifierDecorator {
    
    public SMSNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Call the original method
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
