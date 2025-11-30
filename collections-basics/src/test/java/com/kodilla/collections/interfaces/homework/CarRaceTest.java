package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRaceTest {

    @Test
    void testDoRace() {
        // Testujemy różne samochody, sprawdzając, czy prędkość się zgadza
        Opel opel = new Opel(50);
        Toyota toyota = new Toyota(80);
        Ford ford = new Ford(65);

        // Przeprowadzamy wyścigi
        int opelSpeedBeforeRace = opel.getSpeed();
        int toyotaSpeedBeforeRace = toyota.getSpeed();
        int fordSpeedBeforeRace = ford.getSpeed();

        CarRace.doRace(opel);
        CarRace.doRace(toyota);
        CarRace.doRace(ford);

        // Sprawdzamy, czy po wyścigu prędkości są większe
        assertTrue(opel.getSpeed() > opelSpeedBeforeRace);  // Sprawdzamy, czy Opel przyspieszył
        assertTrue(toyota.getSpeed() > toyotaSpeedBeforeRace);  // Sprawdzamy, czy Toyota przyspieszyła
        assertTrue(ford.getSpeed() > fordSpeedBeforeRace);  // Sprawdzamy, czy Ford przyspieszył
    }
}
