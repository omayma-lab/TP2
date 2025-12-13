package com.omayma.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonnageTest {
    @Test
    public void quand_orientation_NORD_tourner_1_vers_EST() {
        Personnage p = new Personnage();
        assertEquals(Orientation.EST, p.tourner(1));
    }

}

