package ru.job4j.condition;

/**
 * X2 Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 24/05/2021
 */
public class X2 {

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
