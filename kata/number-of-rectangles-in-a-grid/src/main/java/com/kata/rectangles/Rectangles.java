package com.kata.rectangles;

public class Rectangles {
    private Rectangles() {
    }

    public static int numberOfRectangles(int m, int n) {
        var counter = 0;
        for (var i = 0; i < m; ++i) {
            for (var j = 0; j < n; ++j) {
                counter += (m - i) * (n - j);
            }
        }
        return counter;
    }
}
