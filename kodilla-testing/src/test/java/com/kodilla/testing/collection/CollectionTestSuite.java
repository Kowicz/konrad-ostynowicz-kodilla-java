package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Collection Test Case: begin.");
    }

    @AfterEach
    public void after() {
        System.out.println("Collection Test Case: end.");
    }

    @DisplayName(
            "When created an empty list, then OddNumbersExterminator.exterminate() should also return an empty list."
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = Arrays.asList();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(Arrays.asList(), result);
    }

    @DisplayName(
            "When created a list with both odd and even numbers, then OddNumbersExterminator.exterminate() should return a list with only even numbers."
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = Arrays.asList(-5, -3, -2, -1, 0, 1, 2, 3, 5);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(Arrays.asList(-2, 0, 2), result);
    }

}
