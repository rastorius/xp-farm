package com.kata.mumbling;

public class Mumbling {
    private Mumbling() {
    }

    static String accum(String input) {
        var result = new StringBuilder();

        for (var i = 0; i < input.length(); ++i) {
            var currentChar = input.substring(i, i + 1);

            result.append(i == 0 ? "" : "-")
                    .append(currentChar.toUpperCase())
                    .append(currentChar.toLowerCase().repeat(i));
        }

        return result.toString();
    }
}
