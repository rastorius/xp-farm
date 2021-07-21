package com.kata.mumbling;

public class Mumbling {
    private Mumbling() {
    }

    static String accum(String input) {
        var result = "";

        if (input.length() > 0) {
            result += input.substring(0, 1).toUpperCase();
        }

        if (input.length() > 1) {
            var secondChar = input.substring(1, 2);
            result += "-" + secondChar.toUpperCase() + secondChar.toLowerCase();
        }

        return result;
    }
}
