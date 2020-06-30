package com.cebrail.inanc.mars.rover.domain;

import com.cebrail.inanc.mars.rover.base.Utils;
import com.cebrail.inanc.mars.rover.domain.instruction.Instruction;
import com.cebrail.inanc.mars.rover.domain.instruction.InstructionFactory;
import com.cebrail.inanc.mars.rover.enums.Direction;

import java.util.ArrayList;
import java.util.List;

import static com.cebrail.inanc.mars.rover.base.Constants.SPACE;

public class Plateau {
    private Map map;
    private List<Rover> rovers;
    InstructionFactory instructionFactory;

    public Plateau(int x, int y) {
        map = new Map(x, y);
        rovers = new ArrayList<>();
        instructionFactory = new InstructionFactory();
    }

    public boolean addRover(String position, String instructions) {
        Position validPosition = getValidPosition(position);
        if (validPosition == null || Utils.isEmptyString(instructions))
            return false;
        Rover rover = new Rover(validPosition, instructions);
        rovers.add(rover);
        return true;
    }

    public void startRovers() {
        System.out.println("-------------Output-------------");
        rovers.forEach(rover -> {
            iterateRover(rover);
        });
    }

    private void iterateRover(Rover rover) {
        char[] chars = rover.getInstructions().toCharArray();
        for (char command : chars) {
            Instruction instruction = instructionFactory.getInstruction(rover.getPosition(), command);
            Position nextPosition = instruction.execute();
            boolean validPosition = map.isValidPosition(nextPosition);
            if (validPosition)
                rover.setPosition(nextPosition);
        }
        System.out.println(rover.toString());
    }

    private Position getValidPosition(String position) {
        if (Utils.isEmptyString(position))
            return null;
        String[] positions = position.split(SPACE);
        if (positions.length != 3)
            return null;
        String x = positions[0];
        String y = positions[1];
        Direction direction = Direction.getDirectionByKey(positions[2].toUpperCase().charAt(0));
        if (!Utils.isNumeric(x) || !Utils.isNumeric(y) || direction == null)
            return null;
        return new Position(Integer.valueOf(x), Integer.valueOf(y), direction);
    }
}
