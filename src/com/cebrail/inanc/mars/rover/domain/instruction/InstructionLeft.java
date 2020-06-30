package com.cebrail.inanc.mars.rover.domain.instruction;

import com.cebrail.inanc.mars.rover.enums.Direction;
import com.cebrail.inanc.mars.rover.domain.Position;

public class InstructionLeft extends Instruction {

    public InstructionLeft(Position position) {
        super(position);
    }

    @Override
    protected void executeFaceForNorth() {
        nextPosition.setDirection(Direction.WEST);
    }

    @Override
    protected void executeFaceForEast() {
        nextPosition.setDirection(Direction.NORTH);
    }

    @Override
    protected void executeFaceForSouth() {
        nextPosition.setDirection(Direction.EAST);
    }

    @Override
    protected void executeFaceForWest() {
        nextPosition.setDirection(Direction.SOUTH);
    }
}
