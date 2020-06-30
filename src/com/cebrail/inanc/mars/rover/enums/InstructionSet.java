package com.cebrail.inanc.mars.rover.enums;

public enum InstructionSet {

    MOVE('M'), RIGHT('R'), LEFT('L');

    private char key;

    InstructionSet(char key) {
        this.key = key;
    }

    public char getKey() {
        return key;
    }
}
