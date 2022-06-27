package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testChallengeWithDifferentVariables() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertAll(
                // Tests regarding first variable conditions (x >= 2 || x < 1) with constant second variable
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2d, 2d)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1.5d, 2d)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1d, 2d)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(7d, 2d)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(-7d, 2d)),

                // Test regarding second variable condition (y == 1.5) with first variable taken from previous tests
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(1.5d, 1.5d)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1d, 1d))
        );
    }
}
