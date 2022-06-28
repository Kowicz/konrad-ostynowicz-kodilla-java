package com.kodilla.good.patterns.challenges.lento;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(final User customer, final User seller, final LocalDateTime orderDate, final Product product);

}
