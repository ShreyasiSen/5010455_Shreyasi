package com.example.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("Myimage1.jpg");
        Image image2 = new ProxyImage("Myimage2.jpg");

        image1.display(); 
        System.out.println("");

        // Image will not be loaded from disk, as it is cached
        image1.display(); 
        System.out.println("");
        image2.display(); 
        System.out.println("");

        // Image will not be loaded from disk, as it is cached
        image2.display(); 
    }
}
