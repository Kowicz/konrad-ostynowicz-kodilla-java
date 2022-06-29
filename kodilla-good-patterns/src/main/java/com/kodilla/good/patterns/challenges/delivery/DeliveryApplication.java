package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.delivery.suppliers.*;

public class DeliveryApplication {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new SupplyNetwork(), new FaxService());
        orderProcessor.process(orderRequest);





    }
}
