package com.cebrail.inanc.mars.rover.domain;

public class Map {
    private int upperRight_X;
    private int upperRight_Y;

    public Map(int upperRight_X, int upperRight_Y) {
        this.upperRight_X = upperRight_X;
        this.upperRight_Y = upperRight_Y;
    }

    public boolean isValidPosition(Position position){
        if (position.getX() < 0 || position.getY() < 0)
            return  false;
        if (position.getX() > upperRight_X || position.getY() > upperRight_Y)
            return  false;
        return true;
    }
}
