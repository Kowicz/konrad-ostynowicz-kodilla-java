package com.kodilla.good.patterns.challenges.delivery;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Product product = new Product("potatoes", 3d);
        User user = new User("Adam", "Nowak", "ul. Polna 42, 50-073 Wrocław", "123457890");
        return new OrderRequest(product, 14d, user);
    }
}
