package org.side;

import org.side.adapters.OtherMonster;
import org.side.adapters.OtherMonsterAdapter;
import org.side.adapters.OtherMonsterImp;

public class TestPart3 {
    public static void main(String[] args) {
        OtherMonsterImp otherMonster = new OtherMonsterImp(1,2,10,10, 20, 1);
        OtherMonsterAdapter otherMonsterAdapter = new OtherMonsterAdapter(otherMonster);
        System.out.println(otherMonsterAdapter.toString());
    }
}
