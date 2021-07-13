package com.kata.rectangles;

public class Rectangles {
    private Rectangles() {
    }

    public static int numberOfRectangles(int m, int n) {
        int counter = 0;
        for(int i = 1; i <= m; ++i) {
            for(int j = 1; j <= n; ++j) {
                counter += (m - i + 1) * (n - j + 1);
            }
        }

        return counter;
    }
}
