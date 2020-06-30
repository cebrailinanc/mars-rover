package com.cebrail.inanc.mars.rover.domain.instruction;

import com.cebrail.inanc.mars.rover.domain.Position;

/**
 * geçersiz komut geldiğinde işlem yapılmaması sağlanır.
 */
public class InstructionInvalid extends Instruction {
    public InstructionInvalid(Position position) {
        super(position);
    }

    @Override
    protected void executeFaceForNorth() {

    }

    @Override
    protected void executeFaceForEast() {

    }

    @Override
    protected void executeFaceForSouth() {

    }

    @Override
    protected void executeFaceForWest() {

    }
}
