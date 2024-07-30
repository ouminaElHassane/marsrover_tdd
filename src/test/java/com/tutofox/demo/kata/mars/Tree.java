package com.tutofox.demo.kata.mars;

public class Tree {
    public static String painTree(int height) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            result.append(repeat('*', i));
            result.append('\n');
        }
        return result.toString();
    }

    private static char[] repeat(char c, int i) {
        char[] chars = new char[i];
        for (int j = 0; j < i; j++) {
            chars[j] = c;
        }
        return chars;
    }
}
