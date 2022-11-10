package org.side.partie1.entities;

import org.side.utils.Pos;

public class Acteur {

    public final int PV_ORIGINE ;
    public final int DEGAT ;
    public final int MVT ;

    protected int pv;
    protected int degat;
    protected int mvt;
    protected Pos pos;


    public Acteur(int pv_origine, int degat, int mvt) {
        PV_ORIGINE = pv_origine;
        DEGAT = degat;
        MVT = mvt;
    }
}

