package com.example.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Here is the first log message.");
        logger2.log("Here is the second log message.");

        if (logger1 == logger2) {
            System.out.println("Logger1 and Logger2 are the same instance.");
        } else {
            System.out.println("Logger1 and Logger2 are different instances.");
        }
    }
}
