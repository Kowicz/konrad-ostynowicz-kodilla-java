package com.kodilla.good.patterns.challenges.lento;

public class OrderProcessor {
    private final InformationService informationService;
    private final OrderService orderService;
    private final Repository repository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService,
                          final Repository repository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.repository = repository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = orderService.order(orderRequest.getCustomer(), orderRequest.getSeller(),
                orderRequest.getDateOfOrder(), orderRequest.getOrderedProduct());

        if (isRented) {
            informationService.inform(orderRequest.getCustomer(), orderRequest.getSeller(), orderRequest.getOrderedProduct());
            repository.createOrder(orderRequest.getCustomer(), orderRequest.getSeller(),
                    orderRequest.getOrderedProduct(), orderRequest.getDateOfOrder());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getSeller(), false);
        }
    }
}
