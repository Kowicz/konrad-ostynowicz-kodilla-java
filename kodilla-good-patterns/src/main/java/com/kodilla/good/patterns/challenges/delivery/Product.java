package com.kodilla.good.patterns.challenges.delivery;

import java.util.Objects;

public class Product {
    private final String productName;
    private final double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product)) return false;
        Product product = (Product) object;
        return this.productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.productName);
    }

}
