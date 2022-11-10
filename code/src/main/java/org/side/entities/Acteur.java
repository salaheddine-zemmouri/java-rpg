package org.side.entities;

import org.side.utils.Pos;

public class Acteur {

    public final int PV_ORIGINE ;
    public final int DEGAT ;
    public final int MVT ;

    private int pv  ;
    private Pos pos;


    public Acteur(int pv_origine, int degat, int mvt) {
        PV_ORIGINE = pv_origine;
        DEGAT = degat;
        MVT = mvt;
        pv = PV_ORIGINE ;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }
}

