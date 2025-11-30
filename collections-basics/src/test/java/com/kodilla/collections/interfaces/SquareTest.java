package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testSquareCreation() {
        Square square = new Square(4.0);
        assertNotNull(square); // Square powinno być utworzone
    }

    @Test
    void testSquareArea() {
        Square square = new Square(4.0);
        double expectedArea = 4.0 * 4.0;  // Pole kwadratu = bok^2
        assertEquals(expectedArea, square.getArea(), 0.0001); // Sprawdzamy powierzchnię
    }

    @Test
    void testSquarePerimeter() {
        Square square = new Square(4.0);
        double expectedPerimeter = 4.0 * 4.0;  // Obwód kwadratu = 4 * bok
        assertEquals(expectedPerimeter, square.getPerimeter(), 0.0001); // Sprawdzamy obwód
    }
}
