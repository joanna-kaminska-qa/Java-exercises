package com.kodilla.collections.adv.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasicMapExampleTest {

    @Test
    void testGradesMap() {
        // Tworzymy mapę ocen
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        // Testujemy, czy wartości są prawidłowe
        assertEquals(5.0, grades.get("Mathematics"));
        assertEquals(4.5, grades.get("Physics"));
        assertEquals(4.0, grades.get("Philosophy"));

        // Sprawdzamy całą mapę
        assertTrue(grades.containsKey("Mathematics"));
        assertTrue(grades.containsKey("Physics"));
        assertTrue(grades.containsKey("Philosophy"));
    }
}
