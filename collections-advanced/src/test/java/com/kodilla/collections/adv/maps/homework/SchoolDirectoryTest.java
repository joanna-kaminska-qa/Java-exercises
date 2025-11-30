package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SchoolDirectoryTest {

    @Test
    void testSchoolDirectory() {
        // Tworzymy dyrektorów i szkoły
        Principal principal1 = new Principal("Marek Nowak");
        School school1 = new School("XI LO", new ArrayList<>(Arrays.asList(28, 40, 21, 30, 27)));
        Principal principal2 = new Principal("Anna Kowalska");
        School school2 = new School("II LO", new ArrayList<>(Arrays.asList(12, 30, 29, 33, 19)));

        // Dodajemy szkoły do katalogu
        Map<Principal, School> directory = new HashMap<>();
        directory.put(principal1, school1);
        directory.put(principal2, school2);

        // Sprawdzamy dane
        assertEquals("Marek Nowak", principal1.getPrincipal());
        assertEquals("XI LO", school1.getSchoolName());
        assertEquals(5, school1.getStudentsNumberInClasses().size());  // 5 klas

        // Sprawdzamy łączną liczbę uczniów w szkole
        int totalStudents = 0;
        for (int num : school1.getStudentsNumberInClasses()) {
            totalStudents += num;
        }
        assertEquals(146, totalStudents);  // Suma uczniów w klasach XI LO

        // Test dla drugiej szkoły
        totalStudents = 0;
        for (int num : school2.getStudentsNumberInClasses()) {
            totalStudents += num;
        }
        assertEquals(123, totalStudents);  // Suma uczniów w klasach II LO
    }
}
