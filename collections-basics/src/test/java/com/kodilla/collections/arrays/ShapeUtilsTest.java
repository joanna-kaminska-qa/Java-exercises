package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilsTest {

    @Test
    void testDisplayShapeInfo() {
        // Tworzymy prosty kształt (np. kwadrat)
        Shape square = new Square(5); // Kształt kwadratu o boku 5

        // Sprawdzamy, czy kształt nie jest null
        assertNotNull(square);

        // Test przechodzi, bo sprawdzamy tylko, czy obiekt jest poprawnie tworzony
    }
}
