package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();

        // Sprawdzamy dodawanie liczb całkowitych
        assertEquals(5, calculator.add(2, 3));

        // Sprawdzamy dodawanie liczb zmiennoprzecinkowych
        assertEquals(5.5, calculator.add(2.5, 3.0), 0.001);

        // Sprawdzamy dodawanie napisów
        assertEquals("HelloWorld", calculator.add("Hello", "World"));
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();

        // Sprawdzamy odejmowanie liczb całkowitych
        assertEquals(1, calculator.subtract(5, 4));

        // Sprawdzamy odejmowanie liczb zmiennoprzecinkowych
        assertEquals(1.5, calculator.subtract(5.5, 4.0), 0.001);
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();

        // Sprawdzamy mnożenie liczb całkowitych
        assertEquals(20, calculator.multiply(4, 5));

        // Sprawdzamy mnożenie liczb zmiennoprzecinkowych
        assertEquals(20.0, calculator.multiply(4.0, 5.0), 0.001);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();

        // Sprawdzamy dzielenie liczb całkowitych
        assertEquals(2, calculator.divide(6, 3));

        // Sprawdzamy dzielenie liczb zmiennoprzecinkowych
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.001);
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();

        // Sprawdzamy dzielenie przez zero dla liczb całkowitych
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Nie dzielimy przez zero (int)!", exception.getMessage());

        // Sprawdzamy dzielenie przez zero dla liczb zmiennoprzecinkowych
        exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5.0, 0.0);
        });
        assertEquals("Nie dzielimy przez zero (double)!", exception.getMessage());
    }
}
