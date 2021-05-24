package ru.job4j.condition;

/**
 * Club Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 24/05/2021
 */
public class Club {

    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
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
