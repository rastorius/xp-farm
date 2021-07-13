package com.kata.rectangles;

public class Rectangles {
    private Rectangles() {
    }

    public static int numberOfRectangles(int m, int n) {
        var counter = 0;
        for (var i = 1; i <= m; ++i) {
            for (var j = 1; j <= n; ++j) {
                counter += (m - i + 1) * (n - j + 1);
            }
        }
        return counter;
    }
}
