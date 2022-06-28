package com.kodilla.good.patterns.challenges.lento;

import java.time.LocalDateTime;

public class OrderRequest {
    private final User customer;
    private final User seller;
    private final Product orderedProduct;
    private final LocalDateTime dateOfOrder;

    public OrderRequest(User customer, User seller, Product orderedProduct) {
        this.customer = customer;
        this.seller = seller;
        this.orderedProduct = orderedProduct;
        this.dateOfOrder = LocalDateTime.now();
    }

    public User getCustomer() {
        return this.customer;
    }

    public User getSeller() {
        return this.seller;
    }

    public Product getOrderedProduct() {
        return this.orderedProduct;
    }

    public LocalDateTime getDateOfOrder() {
        return this.dateOfOrder;
    }
}
