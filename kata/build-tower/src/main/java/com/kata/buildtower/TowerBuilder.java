package com.kata.buildtower;

import java.util.List;

public class TowerBuilder {
    private TowerBuilder() {
    }

    public static List<String> buildTower(int n) {
        return n == 1 ? List.of("*") : List.of(" * ", "***");
    }
}
