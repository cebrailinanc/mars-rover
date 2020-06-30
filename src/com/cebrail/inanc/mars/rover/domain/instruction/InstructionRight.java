package com.cebrail.inanc.mars.rover.domain.instruction;

import static com.cebrail.inanc.mars.rover.enums.Direction.*;

import com.cebrail.inanc.mars.rover.domain.Position;

public class InstructionRight extends Instruction {

    public InstructionRight(Position position) {
        super(position);
    }

    @Override
    protected void executeFaceForNorth() {
        nextPosition.setDirection(EAST);
    }

    @Override
    protected void executeFaceForEast() {
        nextPosition.setDirection(SOUTH);
    }

    @Override
    protected void executeFaceForSouth() {
        nextPosition.setDirection(WEST);
    }

    @Override
    protected void executeFaceForWest() {
        nextPosition.setDirection(NORTH);
    }
}
