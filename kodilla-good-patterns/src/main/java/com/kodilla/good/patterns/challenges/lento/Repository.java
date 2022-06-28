package com.kodilla.good.patterns.challenges.lento;

import java.time.LocalDateTime;

public interface Repository {

    boolean createOrder(final User customer, final User seller, final Product product, final LocalDateTime orderDate);
}
