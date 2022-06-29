package com.kodilla.good.patterns.challenges.delivery.suppliers;

import com.kodilla.good.patterns.challenges.delivery.OrderDto;
import com.kodilla.good.patterns.challenges.delivery.OrderRequest;
import com.kodilla.good.patterns.challenges.delivery.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Supplier {
    private final String supplierName;
    private final Map<Product, Double> productsMap;

    public Supplier(String supplierName, Map<Product, Double> productsMap) {
        this.supplierName = supplierName;
        this.productsMap = productsMap;
    }

    public abstract boolean process(OrderRequest orderRequest);

    public String getSupplierName() {
        return this.supplierName;
    }

    public Map<Product, Double> getProductsMap() {
        return this.productsMap;
    }

    public List<Product> getProductsList() {
        return this.productsMap.entrySet().stream()
                .flatMap(entry -> Stream.of(entry.getKey()))
                .collect(Collectors.toList());
    }
    public boolean checkIfProductIsAvailable(Product product, double orderedAmount) {
        return this.productsMap.entrySet().stream()
                .filter(entry -> entry.getKey().equals(product))
                .findFirst()
                .filter(productDoubleEntry -> productDoubleEntry.getValue() >= orderedAmount)
                .isPresent();
    }

    public boolean removeProductFromStock(Product product, double orderedAmount) {
        if (this.checkIfProductIsAvailable(product, orderedAmount)) {
            Optional<Map.Entry<Product, Double>> optionalEntry = this.productsMap.entrySet().stream()
                    .filter(entry -> entry.getKey().equals(product))
                    .findFirst();

            Double oldAmount = optionalEntry.get().getValue();
            productsMap.remove(product);

            productsMap.put(product, oldAmount - orderedAmount);

            return true;

        }

        return false;
    }

}
