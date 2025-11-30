package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AverageAgeTest {

    @Test
    void testAverageAge() {
        double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .orElse(0);  // Jeśli brak użytkowników, domyślnie 0

        assertTrue(avg > 0, "Średni wiek powinien być większy niż 0");
    }
}
