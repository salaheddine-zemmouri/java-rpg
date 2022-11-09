package org.side.utils;

public class Pos {
    private final double x;
    private final double y;
    public Pos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* S’appoche (ou s’éloigne si d < 0) de la position pos jusqu’à une
    distance minimale de 1. */
    public Pos moveToward(Pos pos, double distance) {
        double dx = x - pos.x;
        double dy = y - pos.y;
        double d = getDistance(pos);
        double moveDistance = (d < 1) ? 0 : Math.min(distance, d - 1);
        return new Pos(dx / d * moveDistance, dy / d * moveDistance);
    }

    /* Retourne la distance entre le point courant et celui passé en
    paramètre. */
    public double getDistance(Pos pos) {
        double dx = x - pos.x;
        double dy = y - pos.y;
        return Math.hypot(dx, dy);
    }

    public double getX() { return x; }

    public double getY() { return y; }
}