package com.kodilla.good.patterns.challenges.lento;

import java.time.LocalDateTime;

public class OrderRepository implements  Repository{
    @Override
    public boolean createOrder(User customer, User seller, Product product, LocalDateTime orderDate) {
        return true;
    }
}
