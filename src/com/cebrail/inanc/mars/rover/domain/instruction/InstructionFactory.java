package com.cebrail.inanc.mars.rover.domain.instruction;

import com.cebrail.inanc.mars.rover.enums.InstructionSet;
import com.cebrail.inanc.mars.rover.domain.Position;

public class InstructionFactory {

   public Instruction getInstruction(Position position, char instructionKey) {
        if (InstructionSet.MOVE.getKey() == instructionKey) {
            return new InstructionMove(position);
        }
        if (InstructionSet.RIGHT.getKey() == instructionKey) {
            return new InstructionRight(position);
        }
        if (InstructionSet.LEFT.getKey() == instructionKey) {
            return new InstructionLeft(position);
        }
        return new InstructionInvalid(position);
    }
}
