package ru.job4j.condition;

public class Max {

    public int maxNum(int a, int b) {
        return Math.max(a, b);
    }

    public int maxNum(int a, int b, int c) {
        return Math.max(maxNum(a, b), c);
    }

    public int maxNum(int a, int b, int c, int d) {
        return Math.max(maxNum(a, b, c), d);
    }
}
