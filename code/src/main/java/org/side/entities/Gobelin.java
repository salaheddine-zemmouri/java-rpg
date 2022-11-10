package org.side.entities;

import org.side.enums.ACTEUR;

public class Gobelin extends Acteur implements Monstre {
    public Gobelin() {
        super(ACTEUR.GOBELIN.PV_ORIGINE, ACTEUR.GOBELIN.DEGAT, ACTEUR.GOBELIN.MVT);
        System.out.println("Gobelin have been created");
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
