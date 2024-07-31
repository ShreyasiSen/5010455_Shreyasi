package com.example.observer;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp1 ");
        Observer webApp = new WebApp("WebApp1 ");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(10000.50);
        stockMarket.setStockPrice(230005.75);
    }
}
