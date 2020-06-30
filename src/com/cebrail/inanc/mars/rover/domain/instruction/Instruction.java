package com.cebrail.inanc.mars.rover.domain.instruction;

import com.cebrail.inanc.mars.rover.enums.Direction;
import com.cebrail.inanc.mars.rover.domain.Position;

public abstract class Instruction {
    protected static int INCREASE_VALUE = 1;
    protected static int DECREASE_VALUE = -1;
    protected Position nextPosition;

    public Instruction(Position position) {
        this.nextPosition = new Position(position.getX(), position.getY(), position.getDirection());
    }

    public final Position execute() {
        if (Direction.NORTH.equals(nextPosition.getDirection())) {
            executeFaceForNorth();
        } else if (Direction.EAST.equals(nextPosition.getDirection())) {
            executeFaceForEast();
        } else if (Direction.SOUTH.equals(nextPosition.getDirection())) {
            executeFaceForSouth();
        } else if (Direction.WEST.equals(nextPosition.getDirection())) {
            executeFaceForWest();
        }
        return nextPosition;
    }

    protected abstract void executeFaceForNorth();

    protected abstract void executeFaceForEast();

    protected abstract void executeFaceForSouth();

    protected abstract void executeFaceForWest();
}
