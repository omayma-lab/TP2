package com.omayma.tdd;

public class Personnage {
    public Orientation tourner(int nbr) {
        if(nbr>2) {
            return Orientation.OUEST;
        }
        else if(nbr>1) {
            return Orientation.SUD;
        }
        else return Orientation.EST;
    }
}
