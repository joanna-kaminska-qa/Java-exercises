package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaTest {

    @Test
    void testToyotaCreation() {
        Toyota toyota = new Toyota(80);
        assertNotNull(toyota);  // Upewniamy się, że obiekt jest poprawnie tworzony
    }

    @Test
    void testIncreaseSpeed() {
        Toyota toyota = new Toyota(80);
        toyota.increaseSpeed();
        assertEquals(105, toyota.getSpeed());  // Sprawdzamy, czy prędkość została zwiększona o 25
    }

    @Test
    void testDecreaseSpeed() {
        Toyota toyota = new Toyota(80);
        toyota.decreaseSpeed();
        assertEquals(50, toyota.getSpeed());  // Sprawdzamy, czy prędkość została zmniejszona o 30
    }

    @Test
    void testGetSpeed() {
        Toyota toyota = new Toyota(80);
        assertEquals(80, toyota.getSpeed());  // Sprawdzamy, czy prędkość początkowa jest poprawna
    }
}
