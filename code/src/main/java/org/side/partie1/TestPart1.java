package org.side.partie1;

import org.side.partie1.entities.Acteur;
import org.side.partie1.entities.Brigand;
import org.side.partie1.entities.Guerrier;
import org.side.partie1.entities.Monstre;
import org.side.partie1.factory.MonsterFactory;

public class TestPart1 {
    public static void main(String[] args) {



        Monstre monstre = MonsterFactory.getOnlyOneMonsterFactory().createMonster("ger");

        Monstre monstre1 = MonsterFactory.getOnlyOneMonsterFactory().createMonster("gobl");
        Monstre monstre2 = MonsterFactory.getOnlyOneMonsterFactory().createMonster("brig");


        System.out.println(((Acteur)monstre).getPv());
        System.out.println(((Acteur)monstre1).getPv());
        System.out.println(((Acteur)monstre2).getPv());
    }
}
