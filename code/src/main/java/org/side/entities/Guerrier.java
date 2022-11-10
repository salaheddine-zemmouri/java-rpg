package org.side.entities;

import org.side.enums.ACTEUR;

public class Guerrier extends Acteur implements Monstre {
    public Guerrier() {
        super(ACTEUR.GUERRIER.PV_ORIGINE, ACTEUR.GUERRIER.DEGAT, ACTEUR.GUERRIER.MVT);
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
