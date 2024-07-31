package com.example.decorator;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Call the original method
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message....: " + message);
    }
}
