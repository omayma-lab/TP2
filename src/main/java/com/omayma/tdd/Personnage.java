package com.omayma.tdd;

public class Personnage {
    public Orientation tourner(int nbr) {
      int nbrmodulo= nbr % Orientation.values().length;
      return Orientation.values()[nbrmodulo];
    }
}
