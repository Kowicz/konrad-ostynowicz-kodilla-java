package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.delivery.exceptions.SupplierNotFoundException;
import com.kodilla.good.patterns.challenges.delivery.suppliers.Supplier;
import com.kodilla.good.patterns.challenges.delivery.suppliers.SupplyNetwork;

public class OrderProcessor {
    private final SupplyNetwork supplyNetwork;
    private final FaxService faxService;

    public OrderProcessor(SupplyNetwork supplyNetwork, FaxService faxService) {
        this.supplyNetwork = supplyNetwork;
        this.faxService = faxService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean processingSuccessful = false;

        try {
            Supplier supplier = supplyNetwork.getSupplierByProduct(orderRequest.getProduct());
            processingSuccessful = supplier.process(orderRequest);
            faxService.inform(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getAmount());
        } catch (SupplierNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return new OrderDto(orderRequest, processingSuccessful);

    }

    public SupplyNetwork getSupplyNetwork() {
        return supplyNetwork;
    }

    public FaxService getFaxService() {
        return faxService;
    }
}
