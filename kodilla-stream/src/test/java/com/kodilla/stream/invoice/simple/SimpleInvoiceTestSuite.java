package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        // Given
        SimpleInvoice invoice = new SimpleInvoice();

        // When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28d),2.0d));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99d),3.5d));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49d),5.0d));

        // Then
        assertEquals(108.975d, invoice.getValueToPay(), 0.001);
    }
}
