package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity() {
        // Given

            // Preparing countries

        Country poland = new Country("Poland", new BigDecimal("37950000"));
        Country germany = new Country("Germany", new BigDecimal("83240000"));
        Country france = new Country("France", new BigDecimal("67390000"));

        Country egypt = new Country("Egypt", new BigDecimal("102300000"));
        Country southAfrica = new Country("South Africa", new BigDecimal("59310000"));
        Country ghana = new Country("Ghana", new BigDecimal("31070000"));

        Country china = new Country("China", new BigDecimal("1402000000"));
        Country mongolia = new Country("Mongolia", new BigDecimal("3278000"));
        Country kazakhstan = new Country("Kazakhstan", new BigDecimal("18750000"));

            // Preparing continents

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent africa = new Continent("Africa");
        africa.addCountry(egypt);
        africa.addCountry(southAfrica);
        africa.addCountry(ghana);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(mongolia);
        asia.addCountry(kazakhstan);

            // Preparing world

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        // When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        // Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1805288000");
        Assertions.assertEquals(expectedPeopleQuantity, worldPeopleQuantity);

    }
}
