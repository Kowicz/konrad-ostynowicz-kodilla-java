package com.kodilla.good.patterns.challenges.lento;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User customer, User seller, LocalDateTime orderDate, Product product) {
        System.out.println("Customer " + customer.getNick() + " ordered " + product.getProductName()
                + "(ID: " + product.getProductID() + ") from " + seller.getNick()
                + ". Date of order: " + orderDate.getDayOfMonth() + "-" + orderDate.getMonthValue() + "-"
                + orderDate.getYear() + ". Price: " + product.getProductPrice());

        return true;
    }
}

