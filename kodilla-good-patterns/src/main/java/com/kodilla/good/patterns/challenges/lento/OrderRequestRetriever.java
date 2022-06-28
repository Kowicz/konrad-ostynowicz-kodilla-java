package com.kodilla.good.patterns.challenges.lento;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User customer = new User("Jacek", "Kowalski", "customer1");
        User seller = new User("Adam", "Nowak", "seller1");
        Product orderedProduct = new Product("hairbrush", "1234567890", 17.98d);

        return new OrderRequest(customer, seller, orderedProduct);
    }
}
