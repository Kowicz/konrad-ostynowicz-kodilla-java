package com.kodilla.good.patterns.challenges.lento;

public class MailService implements InformationService {
    @Override
    public void inform(User customer, User seller, Product product) {
        sendMailToTheCustomer(customer, seller, product);
        sendMailToTheSeller(customer, seller, product);
    }

    private void sendMailToTheCustomer(User customer, User seller, Product product) {
        System.out.println("Informing the customer about successfully ordering product from the seller.");
    }

    private void sendMailToTheSeller(User customer, User seller, Product product) {
        System.out.println("Informing the seller about customer ordering their product.");
    }
}
