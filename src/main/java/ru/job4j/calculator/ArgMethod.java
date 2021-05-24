package ru.job4j.calculator;

/**
 * @author Enver Eskendarov
 * @version 1.0 23/05/2021
 */
public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.printf("Hello, %s, %d", name, age);
    }

    public static void main(String[] args) {
        final String name = "Petr Arsentev";
        final int age = 33;
        ArgMethod.hello(name, age);
    }
}
