package com.cebrail.inanc.mars.rover.domain;

public class Rover {
    private Position position;
    private String instructions;

    public Rover(Position position, String instructions) {
        this.position = position;
        this.instructions = instructions;
    }

    public Position getPosition() {
        return position;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position.toString();
    }
}
