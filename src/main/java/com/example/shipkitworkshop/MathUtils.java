package com.example.shipkitworkshop;

public class MathUtils {

    /**
     * Checks is the side length define a triangle.
     *
     * @param a Side A
     * @param b Side B
     */
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }
}
