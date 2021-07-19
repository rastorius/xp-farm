package com.kata.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {
    private TowerBuilder() {
    }

    public static List<String> buildTower(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; ++i) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            result.add(spaces + stars + spaces);
        }
        return result;
    }
}
