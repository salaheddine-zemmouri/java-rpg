package org.side.adapters;

public interface OtherMonster {
    double getX();
    double getY();
    double setX(double x);
    double setY(double y);
    int getMaxLifePoints();
    int getLifePoints();
    void takeDamages(int damages);
    int getDamages();
    double getMovement();
}