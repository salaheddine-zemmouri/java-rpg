package org.side.partie1;

import org.side.partie1.entities.Monstre;
import org.side.partie1.factory.MonsterFactory;

public class TestPart1 {
    public static void main(String[] args) {
        Monstre monstre = MonsterFactory.createMonster("gobl");

    }
}
