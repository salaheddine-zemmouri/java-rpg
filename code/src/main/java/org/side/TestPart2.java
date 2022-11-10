package org.side;

import org.side.entities.Acteur;
import org.side.entities.Monstre;
import org.side.entities.Mutant;
import org.side.enums.ACTEUR;
import org.side.factory.MonsterFactory;

public class TestPart2 {
    public static void main(String[] args) {

        Monstre monstre1 = MonsterFactory.getOnlyOneMonsterFactory().createMonster(ACTEUR.GOBELIN.ID);
        Monstre monstre2 = MonsterFactory.getOnlyOneMonsterFactory().createMonster(ACTEUR.GUERRIER.ID) ;

        Monstre mutant = new Mutant(monstre1, monstre2) ;

        System.out.println(((Acteur)mutant).toString());



    }
}
