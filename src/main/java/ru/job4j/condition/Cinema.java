package ru.job4j.condition;

/**
 * Cinema Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 24/05/2021
 */
public class Cinema {

    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
