package org.side.partie1.entities;

import org.side.partie1.enums.ACTEUR;

public class Brigand extends Acteur implements Monstre {
    public Brigand() {
        super(ACTEUR.BRIGAND.PV_ORIGINE, ACTEUR.BRIGAND.DEGAT, ACTEUR.BRIGAND.MVT);
        System.out.println("Brigand have been created");
    }


    @Override
    public void attack() {

    }

    @Override
    public void fuir() {

    }

    @Override
    public void engager() {

    }
}
