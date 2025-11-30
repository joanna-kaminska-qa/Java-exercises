package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testTriangleCreation() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        assertNotNull(triangle); // Triangle powinno być utworzone
    }

    @Test
    void testTriangleArea() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        double expectedArea = 3.0 * 4.0 / 2.0;  // Pole trójkąta = 1/2 * podstawa * wysokość
        assertEquals(expectedArea, triangle.getArea(), 0.0001); // Sprawdzamy pole
    }

    @Test
    void testTrianglePerimeter() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        double expectedPerimeter = 3.0 + 4.0 + 5.0;  // Obwód trójkąta = suma boków
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001); // Sprawdzamy obwód
    }
}
