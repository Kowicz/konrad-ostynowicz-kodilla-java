package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        // Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // When
        double average = ArrayOperations.getAverage(numbers);

        // Then
        double expectedAvg = 5.5d;
        assertEquals(expectedAvg,average);

    }
}
