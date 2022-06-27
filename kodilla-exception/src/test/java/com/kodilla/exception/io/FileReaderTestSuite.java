package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFileWithName() {
        // Given
        FileReader reader = new FileReader();

        // When & Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> reader.readFile("nonexistent_file.txt")),
                () -> assertThrows(FileReaderException.class, () -> reader.readFile(null)),
                () -> assertDoesNotThrow(() -> reader.readFile())
        );
    }
}
