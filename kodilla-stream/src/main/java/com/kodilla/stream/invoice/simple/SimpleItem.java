package com.kodilla.stream.invoice.simple;

public final class SimpleItem {

    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(final SimpleProduct product, final double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getValue() {
        return this.product.getProductPrice() * this.quantity;
    }

    public SimpleProduct getProduct() {
        return this.product;
    }

    public double getQuantity() {
        return this.quantity;
    }
}
