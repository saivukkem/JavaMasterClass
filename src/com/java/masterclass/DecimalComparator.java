package com.java.masterclass;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int param1 = (int) (num1 * 1000);
        int param2 = (int) (num2 * 1000);

        boolean result = false;

        if (param1 == param2) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
