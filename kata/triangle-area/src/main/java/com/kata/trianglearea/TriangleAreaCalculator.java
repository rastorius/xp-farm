package com.kata.trianglearea;

public class TriangleAreaCalculator {
    private TriangleAreaCalculator() {
    }

    private static int get_length(String triangle) {
        return triangle.split("\n").length - 1;
    }

    private static float calculate_area(int length) {
        if (length == 1) {
            return 0.5F;
        } else {
            return calculate_area(length - 1) + length - 0.5F;
        }
    }

    public static float t_area(String triangle) {
        return calculate_area(get_length(triangle));
    }
}
