package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpelTest {

    @Test
    void testOpelCreation() {
        Opel opel = new Opel(50);
        assertNotNull(opel);  // Upewniamy się, że obiekt jest poprawnie tworzony
    }

    @Test
    void testIncreaseSpeed() {
        Opel opel = new Opel(50);
        opel.increaseSpeed();
        assertEquals(92, opel.getSpeed());  // Sprawdzamy, czy prędkość została zwiększona o 42
    }

    @Test
    void testDecreaseSpeed() {
        Opel opel = new Opel(50);
        opel.decreaseSpeed();
        assertEquals(15, opel.getSpeed());  // Sprawdzamy, czy prędkość została zmniejszona o 35
    }

    @Test
    void testGetSpeed() {
        Opel opel = new Opel(50);
        assertEquals(50, opel.getSpeed());  // Sprawdzamy, czy prędkość początkowa jest poprawna
    }
}
