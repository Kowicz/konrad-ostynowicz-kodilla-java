package com.kodilla.good.patterns.challenges.delivery;

public class OrderDto {
    private final OrderRequest orderRequest;
    private final boolean orderPlaced;

    public OrderDto(OrderRequest orderRequest, boolean orderPlaced) {
        this.orderRequest = orderRequest;
        this.orderPlaced = orderPlaced;
    }

    public OrderRequest getOrderRequest() {
        return this.orderRequest;
    }

    public boolean isOrderPlaced() {
        return this.orderPlaced;
    }
}
