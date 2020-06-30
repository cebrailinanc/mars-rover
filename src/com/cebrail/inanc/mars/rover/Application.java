package com.cebrail.inanc.mars.rover;

import com.cebrail.inanc.mars.rover.base.Utils;
import com.cebrail.inanc.mars.rover.domain.Plateau;

import java.util.Scanner;

import static com.cebrail.inanc.mars.rover.base.Constants.ADD_ROVER;
import static com.cebrail.inanc.mars.rover.base.Constants.SPACE;

public class Application {

    public static void main(String[] args) {
        Plateau plateau = createPlateau();
        plateau.startRovers();
    }

    private static Plateau createPlateau() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("upper-right coordinates of the plateau: ");
        String coordinate = scanner.nextLine();
        Plateau plateau = getValidPlateau(coordinate);
        if (plateau == null) {
            System.err.println("plateau info not valid");
            System.exit(0);
        }
        System.out.println("Add Rovers...");
        String addRover = ADD_ROVER;
        while (ADD_ROVER.equals(addRover)) {
            System.out.print("rover's position: ");
            String position = scanner.nextLine();
            System.out.print("series of instructions:");
            String instructions = scanner.nextLine();
            boolean isAdded = plateau.addRover(position, instructions);
            if (isAdded)
                System.out.println("Rover added");
            else
                System.err.println("Rover not added");
            System.out.print("Would you like to add a rover?(Y/another input) :");
            addRover = scanner.nextLine();
        }
        return plateau;
    }

    private static Plateau getValidPlateau(String input) {
        if (Utils.isEmptyString(input))
            return null;
        String[] coordinates = input.split(SPACE);
        if (coordinates.length != 2)
            return null;
        String maxX = coordinates[0];
        String maxY = coordinates[1];
        if (!Utils.isNumeric(maxX) || !Utils.isNumeric(maxY))
            return null;
        return new Plateau(Integer.valueOf(maxX), Integer.valueOf(maxY));
    }
}
