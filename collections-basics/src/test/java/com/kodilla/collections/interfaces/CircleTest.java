package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircleCreation() {
        Circle circle = new Circle(5.0);
        assertNotNull(circle); // Circle powinno być utworzone
    }

    @Test
    void testCircleArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.0001); // Sprawdzamy obliczoną powierzchnię
    }

    @Test
    void testCirclePerimeter() {
        Circle circle = new Circle(5.0);
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001); // Sprawdzamy obwód
    }
}
