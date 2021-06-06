package ru.job4j.array;

import java.util.Arrays;

/**
 * Machine Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 06/06/2021
 */
public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int coin : coins) {
            while (balance >= coin) {
                balance = balance - coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
