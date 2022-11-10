package org.side.partie1;

public class MonsterFactory {
    public static Monstre createMonster(String id) {
        return switch (id) {
            case "ger" -> new Guerrier();
            case "brig" -> new Brigand();
            case "gobl" -> new Gobelin();
            default -> null;
        };
    }
}
