package org.side.enums;

public enum ACTEUR  {
    BRIGAND(8, 2, 10),
    GOBELIN(4, 1, 15) ,
    GURRIER(10, 3, 10) ,

    JOUEUR(5,5,5) ;
    public final int PV_ORIGINE ;
    public final int DEGAT ;
    public final int MVT ;

    ACTEUR(int pv_origine, int degat, int mvt) {
        PV_ORIGINE = pv_origine;
        DEGAT = degat;
        MVT = mvt;
    }
}
