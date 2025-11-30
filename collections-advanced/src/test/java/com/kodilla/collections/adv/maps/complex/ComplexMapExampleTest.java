package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ComplexMapExampleTest {

    @Test
    void testAverageGrades() {
        // Tworzymy uczniów
        Student john = new Student("John", "Stevenson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        // Tworzymy oceny
        Grades johnGrades = new Grades(Arrays.asList(5.0, 4.0, 4.5, 5.0, 5.0));
        Grades jessieGrades = new Grades(Arrays.asList(2.5, 3.0, 2.0));
        Grades bartGrades = new Grades(Arrays.asList(4.0, 4.0, 4.0, 4.0, 5.0));

        // Tworzymy mapę uczniów i ich ocen
        Map<Student, Grades> school = new HashMap<>();
        school.put(john, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(bart, bartGrades);

        // Sprawdzamy średnią ocen dla każdego ucznia
        assertEquals(4.5, johnGrades.getAverage(), 0.5);  // Dopuszczamy margines tolerancji 0.5
        assertEquals(2.875, jessieGrades.getAverage(), 0.5);
        assertEquals(4.2, bartGrades.getAverage(), 0.5);
    }
}
