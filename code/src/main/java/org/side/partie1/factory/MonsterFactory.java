package org.side.partie1.factory;

import org.side.partie1.entities.Brigand;
import org.side.partie1.entities.Gobelin;
import org.side.partie1.entities.Guerrier;
import org.side.partie1.entities.Monstre;

/*
Factory design pattern provides approach to code for interface rather than implementation.
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.
* */

public class MonsterFactory {
    private static  MonsterFactory onlyOneMonsterFactory;
    public static Monstre createMonster(String id) {
        return switch (id) {
            case "ger" -> new Guerrier();
            case "brig" -> new Brigand();
            case "gobl" -> new Gobelin();
            default -> null;
        };
    }
}
