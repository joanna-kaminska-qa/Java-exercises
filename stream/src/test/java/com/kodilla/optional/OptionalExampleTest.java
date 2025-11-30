package com.kodilla.optional;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalExampleTest {

    @Test
    void testOptional() {
        User user = new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        // Sprawdzamy, czy username jest wypisany, jeśli user istnieje
        optionalUser.ifPresent(u -> assertEquals("user1", u.getUsername()));
    }

    @Test
    void testOptionalEmpty() {
        User user = null;
        Optional<User> optionalUser = Optional.ofNullable(user);

        // Sprawdzamy, czy user jest null
        assertTrue(optionalUser.isEmpty(), "Optional powinien być pusty");
    }
}
