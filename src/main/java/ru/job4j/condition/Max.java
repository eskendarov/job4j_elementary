package ru.job4j.condition;

public class Max {

    public int maxNum(int a, int b) {
        return (a < b) ? b : a;
    }

    public int maxNum(int a, int b, int c) {
        return maxNum(maxNum(a, b), c);
    }

    public int maxNum(int a, int b, int c, int d) {
        return maxNum(maxNum(a, b, c), d);
    }
}
