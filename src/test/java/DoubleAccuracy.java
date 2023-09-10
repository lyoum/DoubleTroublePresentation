/*
 * Copyright (c) 2011.  Peter Lawrey
 *
 * "THE BEER-WARE LICENSE" (Revision 128)
 * As long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a beer in return
 * There is no warranty.
 */

import java.math.BigDecimal;

public class DoubleAccuracy {

    static double[] ds = {
            0.1,
            0.2,
            -0.3,
            0.1 + 0.2,
            0.1 + 0.2 - 0.3};

    public static void main(String[] args) {
        printOriginal();
        printFixed();
    }

    private static void printOriginal() {
        System.out.println("Original:");
        for (double d : ds) {
            System.out.println(d + " => " + new BigDecimal(d));
        }
        System.out.println("");
    }

    private static void printFixed() {
        System.out.println("After fixed:");
        for (double d : ds) {
            System.out.println(d + " => " + new BigDecimal(roundToTwoPlaces(d)) + " to two places: " + roundToTwoPlaces(d));
        }
        System.out.println("");
    }

    // uses round half up, or bankers' rounding
    public static double roundToTwoPlaces(double d) {
        return Math.round(d * 100) / 100.0;
    }
}
