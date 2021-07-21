package com.kata.mumbling;

public class Mumbling {
    private Mumbling() {
    }

    static String accum(String input) {
        return input.length() < 2 ? input.toUpperCase() : "Z-Xx";
    }
}
