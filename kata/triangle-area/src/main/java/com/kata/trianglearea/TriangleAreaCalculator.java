package com.kata.trianglearea;

public class TriangleAreaCalculator {
    private TriangleAreaCalculator() {
    }

    private static int getLength(String triangle) {
        return triangle.split("\n").length - 1;
    }

    private static float calculateArea(int length) {
        return length == 1 ? 0.5F : calculateArea(length - 1) + length - 0.5F;
    }

    public static float triangleArea(String triangle) {
        return calculateArea(getLength(triangle));
    }
}
