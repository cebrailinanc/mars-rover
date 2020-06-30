package com.cebrail.inanc.mars.rover.domain;

import com.cebrail.inanc.mars.rover.enums.Direction;

public class Position implements Cloneable{
    private int x;
    private int y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void addX(int value) {
        this.x += value;
    }

    public void addY(int value) {
        this.y += value;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction.getKey();
    }
}
