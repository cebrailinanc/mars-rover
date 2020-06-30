package com.cebrail.inanc.mars.rover.base;

public class Utils {
    private Utils() {
    }

   public static boolean isNumeric(String value) {
        return value.matches("\\d+");
    }

    public static boolean isEmptyString(String string) {
        return string == null || string.trim().isEmpty();
    }
}
