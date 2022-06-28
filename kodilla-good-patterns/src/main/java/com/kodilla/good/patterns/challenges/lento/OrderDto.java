package com.kodilla.good.patterns.challenges.lento;

public class OrderDto {
    private final User customer;
    private final boolean orderPlaced;

    public OrderDto(User customer, boolean orderPlaced) {
        this.customer = customer;
        this.orderPlaced = orderPlaced;
    }

    public User getCustomer() {
        return this.customer;
    }

    public boolean isOrderPlaced() {
        return this.orderPlaced;
    }
}
