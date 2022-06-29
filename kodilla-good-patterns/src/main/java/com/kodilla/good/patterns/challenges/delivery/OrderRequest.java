package com.kodilla.good.patterns.challenges.delivery;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Product product;
    private final Double amount;

    private final User customer;
    private final LocalDateTime dateOfOrder;

    public OrderRequest(Product product, Double amount, User customer) {
        this.product = product;
        this.amount = amount;
        this.customer = customer;
        this.dateOfOrder = LocalDateTime.now();
    }

    public Product getProduct() {
        return this.product;
    }

    public Double getAmount() {
        return this.amount;
    }

    public User getCustomer() {
        return this.customer;
    }

    public LocalDateTime getDateOfOrder() {
        return this.dateOfOrder;
    }
}
