package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordTest {

    @Test
    void testFordCreation() {
        Ford ford = new Ford(60);
        assertNotNull(ford);  // Upewniamy się, że obiekt jest poprawnie tworzony
    }

    @Test
    void testIncreaseSpeed() {
        Ford ford = new Ford(60);
        ford.increaseSpeed();
        assertEquals(90, ford.getSpeed());  // Sprawdzamy, czy prędkość została zwiększona o 30
    }

    @Test
    void testDecreaseSpeed() {
        Ford ford = new Ford(60);
        ford.decreaseSpeed();
        assertEquals(40, ford.getSpeed());  // Sprawdzamy, czy prędkość została zmniejszona o 20
    }

    @Test
    void testGetSpeed() {
        Ford ford = new Ford(60);
        assertEquals(60, ford.getSpeed());  // Sprawdzamy, czy prędkość początkowa jest poprawna
    }
}
