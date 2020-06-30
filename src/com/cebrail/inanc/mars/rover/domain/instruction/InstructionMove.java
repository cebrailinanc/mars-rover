package com.cebrail.inanc.mars.rover.domain.instruction;


import com.cebrail.inanc.mars.rover.domain.Position;

public class InstructionMove extends Instruction {

    public InstructionMove(Position position) {
        super(position);
    }

    @Override
    protected void executeFaceForNorth() {
        nextPosition.addY(INCREASE_VALUE);
    }

    @Override
    protected void executeFaceForEast() {
        nextPosition.addX(INCREASE_VALUE);
    }

    @Override
    protected void executeFaceForSouth() {
        nextPosition.addY(DECREASE_VALUE);
    }

    @Override
    protected void executeFaceForWest() {
        nextPosition.addX(DECREASE_VALUE);
    }
}
