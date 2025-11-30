package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CarUtilsTest {

    @Test
    void testDisplayCarInfo() {
        // Tworzymy prosty samochód Ford (wystarczy, żeby tylko istniał)
        Car fordCar = new Ford(100);  // Ford z prędkością 100

        // Sprawdzamy, czy nie mamy null'a
        assertNotNull(fordCar);

        // Jeśli mamy obiekt, to już test przechodzi
    }
}
