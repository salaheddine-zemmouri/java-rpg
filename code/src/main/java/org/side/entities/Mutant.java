package org.side.entities;

import java.util.ArrayList;
import java.util.List;

public class Mutant extends Acteur implements Monstre {

    /* private ArrayList<Monstre> monstres = new ArrayList<>(2);*/

    Monstre monstre1 ;
    Monstre monstre2 ;

    public Mutant(Monstre monstre1, Monstre monstre2) {
        super(
                ((Acteur)monstre1).PV_ORIGINE + ((Acteur)monstre2).PV_ORIGINE,
                ((Acteur)monstre1).DEGAT + ((Acteur)monstre2).DEGAT,
                Math.min(((Acteur)monstre1).MVT , ((Acteur)monstre2).MVT)
        );
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
