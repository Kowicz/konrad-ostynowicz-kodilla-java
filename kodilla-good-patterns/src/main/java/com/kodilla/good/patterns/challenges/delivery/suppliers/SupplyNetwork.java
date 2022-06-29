package com.kodilla.good.patterns.challenges.delivery.suppliers;

import com.kodilla.good.patterns.challenges.delivery.OrderRequest;
import com.kodilla.good.patterns.challenges.delivery.Product;
import com.kodilla.good.patterns.challenges.delivery.exceptions.SupplierNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class SupplyNetwork {
    List<Supplier> suppliers = new ArrayList<>();

    public SupplyNetwork() {
        this.addDefaultSuppliers();
    }

    public Supplier getSupplierByProduct(Product product) throws SupplierNotFoundException {
        Optional<Supplier> optionalSupplier = suppliers.stream()
                .filter(supplier -> supplier.getProductsList().contains(product))
                .findFirst();

        if (optionalSupplier.isPresent()) {
            return optionalSupplier.get();
        } else {
            throw new SupplierNotFoundException("No supplier can provide requested product.");
        }
    }

    private void addDefaultSuppliers() {
        this.addExtraFoodShop();
        this.addHealthyShop();
        this.addGlutenFreeShop();
        this.addProductToTheSupplier(new Product("potatoes", 3d), 8000d, "GlutenFreeShop");
    }

    private void addExtraFoodShop() {
        addSupplier(new Supplier("ExtraFoodShop", new HashMap<Product, Double>()) {
            public boolean process(OrderRequest orderRequest) {

                if (orderRequest.getAmount() >= 100d && orderRequest.getAmount() <= 10_000d) {
                    this.removeProductFromStock(orderRequest.getProduct(), orderRequest.getAmount());
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void addHealthyShop() {
        addSupplier(new Supplier("HealthyShop", new HashMap<Product, Double>()) {
            @Override
            public boolean process(OrderRequest orderRequest) {
                boolean isAvailable = this.checkIfProductIsAvailable(orderRequest.getProduct(), orderRequest.getAmount());
                double totalValue = orderRequest.getAmount() * orderRequest.getProduct().getPrice();

                if (isAvailable && totalValue > 250d) {
                    this.removeProductFromStock(orderRequest.getProduct(), orderRequest.getAmount());
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void addGlutenFreeShop() {
        addSupplier(new Supplier("GlutenFreeShop", new HashMap<Product, Double>()) {
            @Override
            public boolean process(OrderRequest orderRequest) {
                boolean isAvailable = this.checkIfProductIsAvailable(orderRequest.getProduct(), orderRequest.getAmount());

                if (isAvailable) {
                    this.removeProductFromStock(orderRequest.getProduct(), orderRequest.getAmount());
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    public boolean addSupplier(Supplier supplier) {
        return suppliers.add(supplier);
    }

    public boolean addProductToTheSupplier(Product product, double startingAmount, String supplierName) {
        try {
            getSupplierByName(supplierName).getProductsMap().put(product, startingAmount);
            return true;
        } catch (SupplierNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return false;
    }


    public Supplier getSupplierByName(String supplierName) throws SupplierNotFoundException {
        Optional<Supplier> optionalSupplier = suppliers.stream()
                .filter(supplier -> supplier.getSupplierName().equals(supplierName))
                .findFirst();

        if (optionalSupplier.isPresent()) {
            return  optionalSupplier.get();
        } else {
            throw new SupplierNotFoundException("No supplier is matching given name.");
        }
    }
}
