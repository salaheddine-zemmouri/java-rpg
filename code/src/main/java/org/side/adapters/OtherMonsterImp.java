package org.side.adapters;

public class OtherMonsterImp implements OtherMonster {

    double x;
    double y;
    int maxLifePoints;
    int lifePoints;
    int movement;
    int damages;

    public OtherMonsterImp(double x, double y, int maxLifePoints, int lifePoints, int movement, int damages) {
        this.x = x;
        this.y = y;
        this.maxLifePoints = maxLifePoints;
        this.lifePoints = lifePoints;
        this.movement = movement;
        this.damages = damages;
    }




    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double setX(double x) {
        this.x = x;
        return x;
    }

    @Override
    public double setY(double y) {
        this.y = y;
        return y;
    }

    @Override
    public int getMaxLifePoints() {
        return this.maxLifePoints;
    }

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public void takeDamages(int damages) {
        this.lifePoints -= damages;
    }

    @Override
    public int getDamages() {
        return this.damages;
    }

    @Override
    public double getMovement() {
        return this.movement;
    }
}
