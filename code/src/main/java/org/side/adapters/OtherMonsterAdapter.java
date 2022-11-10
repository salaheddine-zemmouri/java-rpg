package org.side.adapters;

import org.side.entities.Acteur;
import org.side.entities.Monstre;



public class OtherMonsterAdapter extends Acteur implements Monstre {

    private OtherMonster otherMonster;


    public OtherMonsterAdapter(OtherMonsterImp otherMonster) {
        super(otherMonster.getMaxLifePoints(),otherMonster.getDamages(),(int)otherMonster.getMovement());
    }

    @Override
    public void attack() {

    }

    @Override
    public void fuir() {

    }

    @Override
    public void engager() {

    }
}
