package com.kodilla.good.patterns.challenges.lento;

public class Product {
    private String productName;
    private String productID;
    private double productPrice;

    public Product(String productName, String productID, double productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductID() {
        return this.productID;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

}

