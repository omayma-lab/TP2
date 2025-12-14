package com.omayma.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonnageTest {
    @Test
    public void quand_orientation_NORD_tourner_1_vers_EST() {
        Personnage p = new Personnage();
        assertEquals(Orientation.EST, p.tourner(1));
    }
    @Test
    public void quand_orientation_NORD_tourner_2_vers_SUD() {
        Personnage p = new Personnage();
        assertEquals(Orientation.SUD, p.tourner(2));
    }
    @Test
    public void quand_orientation_NORD_tourner_3_vers_OUEST() {
        Personnage p = new Personnage();
        assertEquals(Orientation.OUEST, p.tourner(3));
    }
    @Test
    public void quand_orientation_NORD_tourner_4_vers_NORD() {
        Personnage p = new Personnage();
        assertEquals(Orientation.NORD, p.tourner(4));
    }


}

