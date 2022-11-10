package org.side.partie1.entities;

import org.side.partie1.enums.ACTEUR;

public class Guerrier extends Acteur implements Monstre {
    public Guerrier() {
        super(ACTEUR.GURRIER.PV_ORIGINE, ACTEUR.GURRIER.DEGAT, ACTEUR.GURRIER.MVT);
        System.out.println("Guerrier have been created");
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
