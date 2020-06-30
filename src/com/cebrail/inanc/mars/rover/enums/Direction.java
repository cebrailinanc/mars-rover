package com.cebrail.inanc.mars.rover.enums;

import java.util.Arrays;

public enum Direction {
    NORTH('N'), SOUTH('S'), EAST('E'), WEST('W');

    private char key;

    Direction(char key) {
        this.key = key;
    }

    public char getKey() {
        return key;
    }

    public static Direction getDirectionByKey(char key) {
        return Arrays.stream(Direction.values())
                .filter(e -> e.getKey() == key)
                .findFirst()
                .orElse(null);
    }
}
