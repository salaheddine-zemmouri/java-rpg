package org.side.partie1;

import org.side.partie1.entities.Acteur;
import org.side.partie1.entities.Brigand;
import org.side.partie1.entities.Guerrier;
import org.side.partie1.entities.Monstre;
import org.side.partie1.factory.MonsterFactory;


/*
Factory design pattern provides approach to code for interface rather than implementation.
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.
* */

/*
* Creating a lot of factories for creating monsters each time, will affect the performance of the code, so using
* singleton will help to make sure that only one instance is created
*
* idea :
*      we can use to strategies :
*              * LAZY instantiation : what we did in the code
*              * EAGER ///////////  : By instantiation the only class inside the factory
* */

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
