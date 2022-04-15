package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("TDD: ShapeCollector Taste Suite")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for modifying collection.")
    class TestModifyingCollection {

        @DisplayName("When a triangle gets added to the newly created ShapeCollector," +
                "then getShapesQuantity returns 1.")
        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4, 8);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @DisplayName("When a square gets added to the newly created ShapeCollector," +
                "then getShapesQuantity returns 1.")
        @Test
        void testAddSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @DisplayName("When a disk gets added to the newly created ShapeCollector," +
                "then getShapesQuantity returns 1.")
        @Test
        void testAddDisk() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Disk disk = new Disk(4);

            //When
            shapeCollector.addFigure(disk);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @DisplayName("When an only figure gets removed from ShapeCollector, then return true.")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Disk disk = new Disk(4);
            shapeCollector.addFigure(disk);


            //When
            boolean result = shapeCollector.removeFigure(disk);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @DisplayName("When a figure not added to ShapeCollector gets removed, return false.")
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Disk disk = new Disk(4);

            //When
            boolean result = shapeCollector.removeFigure(disk);

            //Then
            Assertions.assertFalse(result);

        }

    }

    @Nested
    @DisplayName("Tests for accessing collection.")
    class TestAccessingCollection {

        @DisplayName("When a created figure gets added to the ShapeCollector," +
                "then a figure retrieved via getter should be same as the figure created earlier.")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Disk disk = new Disk(4);
            shapeCollector.addFigure(disk);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(disk, result);
        }

        @DisplayName("When getting figure from an out-of-bound index, then should return null.")
        @Test
        void testGetFigureOutOfBounds() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertNull(result);
        }

        @DisplayName("When showing figures with empty list, should return empty String.")
        @Test
        void showFiguresEmptyList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("", result);
        }

        @DisplayName("When showing figures, returned String should correspond to the figures added earlier.")
        @Test
        void showFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Disk(4));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Triangle(4, 8));

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("disk, square, triangle", result);
        }



    }
}
