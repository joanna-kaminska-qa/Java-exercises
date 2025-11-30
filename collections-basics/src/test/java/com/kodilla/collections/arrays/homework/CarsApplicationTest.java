package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsApplicationTest {

    @Test
    void testDrawCar() {
        // Sprawdzamy, czy funkcja drawCar() poprawnie generuje różne samochody
        Car car = CarsApplication.drawCar();
        assertNotNull(car); // Car nie może być null

        // Sprawdzamy, czy car to jeden z przewidzianych typów (Ford, Opel, Toyota)
        assertTrue(car instanceof Ford || car instanceof Opel || car instanceof Toyota);
    }

    @Test
    void testDrawCarKind() {
        // Sprawdzamy, czy losowy wybór typu samochodu działa poprawnie
        int countFord = 0;
        int countOpel = 0;
        int countToyota = 0;

        for (int i = 0; i < 100; i++) {
            Car car = CarsApplication.drawCar();
            if (car instanceof Ford) countFord++;
            if (car instanceof Opel) countOpel++;
            if (car instanceof Toyota) countToyota++;
        }

        // Sprawdzamy, czy wszystkie typy są mniej więcej równomiernie rozłożone
        assertTrue(countFord > 10);
        assertTrue(countOpel > 10);
        assertTrue(countToyota > 10);
    }
}
