package org.side.partie1.factory;

import org.side.partie1.entities.Brigand;
import org.side.partie1.entities.Gobelin;
import org.side.partie1.entities.Guerrier;
import org.side.partie1.entities.Monstre;


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
        return switch (id) {
            case "ger" -> new Guerrier();
            case "brig" -> new Brigand();
            case "gobl" -> new Gobelin();
            default -> null;
        };
    }
}
