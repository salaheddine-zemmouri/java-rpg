package org.side.factory;

import org.side.entities.Brigand;
import org.side.entities.Gobelin;
import org.side.entities.Guerrier;
import org.side.entities.Monstre;
import org.side.enums.ACTEUR;


public class MonsterFactory {
    private static  MonsterFactory onlyOneMonsterFactory;

    private MonsterFactory() {

    }

    public static MonsterFactory getOnlyOneMonsterFactory() {
        if (onlyOneMonsterFactory == null) {
            System.out.println("Only instance created");
            onlyOneMonsterFactory = new MonsterFactory() ;
        }

        return onlyOneMonsterFactory ;
    }
    public Monstre createMonster(String id) {
        if(id.equals(ACTEUR.GUERRIER.ID)) return new Guerrier();
        else if(id.equals(ACTEUR.BRIGAND.ID)) return new Brigand();
        else if(id.equals(ACTEUR.GOBELIN.ID)) return new Guerrier();
        else return null;
    }
}
