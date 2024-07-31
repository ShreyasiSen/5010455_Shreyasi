package com.example.singleton;

public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code here
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("The Log message: " + message);
    }
}
