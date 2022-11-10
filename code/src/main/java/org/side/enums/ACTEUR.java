package org.side.enums;

public enum ACTEUR {
    BRIGAND(8, 2, 10, "brg"),
    GOBELIN(4, 1, 15, "gbl") ,
    GUERRIER(10, 3, 10, "orc") ,

    JOUEUR(5,5,5, "player") ;
    public final int PV_ORIGINE ;
    public final int DEGAT ;
    public final int MVT ;
    public final String ID;

    ACTEUR(int pv_origine, int degat, int mvt, String id) {
        PV_ORIGINE = pv_origine;
        DEGAT = degat;
        MVT = mvt;
        ID = id;
    }
}
