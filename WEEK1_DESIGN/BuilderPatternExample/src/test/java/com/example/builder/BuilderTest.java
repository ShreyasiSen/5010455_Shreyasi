package com.example.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder("Intel i8", 16)
                                .setStorage(512)
                                .setGraphicsCard(true)
                                .setWiFi(true)
                                .build();

        Computer computer2 = new Computer.Builder("AMD Ryzen 4", 8)
                                .setStorage(256)
                                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
