package ru.job4j.calculator;

/**
 * @author Enver Eskendarov
 * @version 1.0 23/05/2021
 */
public class ArgMethod {

    public static void hello(Object... args) {
        System.out.print("Hello, ");
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final String name = "Petr Arsentev";
        final int age = 33;
        ArgMethod.hello();
        ArgMethod.hello(name, age);
        ArgMethod.hello(age);
        ArgMethod.hello(name, name, name);
    }
}
