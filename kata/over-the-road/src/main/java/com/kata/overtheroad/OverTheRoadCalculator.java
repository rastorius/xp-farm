package com.kata.overtheroad;

public class OverTheRoadCalculator {
    private OverTheRoadCalculator() {
    }

    public static long overTheRoad(long address, long n) {
        if (address % 2 == 1) {
            return 2 * n - (address - 1L);
        } else {
            return 1L;
        }
    }
}
