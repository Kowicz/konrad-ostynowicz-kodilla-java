package com.kodilla.testing.calculator;

import org.junit.jupiter.api.*;

public class CalculatorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Calculator Test Case: begin.");
    }

    @AfterEach
    public void after() {
        System.out.println("Calculator Test Case: end.");
    }

    @DisplayName(
            "When given two numbers, then SimpleCalculator.add() should return the sum of these numbers."
    )
    @Test
    void testAddingTwoGivenNumbers(){
        //Given
        int firstNumber = 43;
        int secondNumber = 135;
        SimpleCalculator calculator = new SimpleCalculator();
        //When
        int result = calculator.add(firstNumber, secondNumber);
        //Then
        Assertions.assertEquals(firstNumber + secondNumber, result);
    }

    @DisplayName(
            "When given two numbers, then SimpleCalculator.subtract() should return the difference of these numbers."
    )
    @Test
    void testSubtractingTwoGivenNumbers() {
        //Given
        int firstNumber = 43;
        int secondNumber = 135;
        SimpleCalculator calculator = new SimpleCalculator();

        //When
        int result = calculator.subtract(firstNumber, secondNumber);

        //Then
        Assertions.assertEquals(firstNumber - secondNumber, result);
    }
}
