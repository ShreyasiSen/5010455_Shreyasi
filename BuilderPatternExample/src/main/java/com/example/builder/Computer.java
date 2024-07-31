package com.example.builder;

public class Computer {
    private final String CPU;
    private final int RAM;
    private final int storage;
    private final boolean hasGraphicsCard;
    private final boolean hasWiFi;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWiFi = builder.hasWiFi;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB, Graphics Card=" 
                + (hasGraphicsCard ? "Yes" : "No") + ", WiFi=" + (hasWiFi ? "Yes" : "No") + "]";
    }

    public static class Builder {
        private final String CPU;
        private final int RAM;
        private int storage;
        private boolean hasGraphicsCard;
        private boolean hasWiFi;

        public Builder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
