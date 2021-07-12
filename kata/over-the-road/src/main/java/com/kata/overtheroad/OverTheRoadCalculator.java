package com.kata.overtheroad;

public class OverTheRoadCalculator {
    private OverTheRoadCalculator() {
    }

    public static long overTheRoad(long address, long n) {
        return 2 * n - address + 1L;
    }
}
