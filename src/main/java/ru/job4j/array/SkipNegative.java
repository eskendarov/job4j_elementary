package ru.job4j.array;

/**
 * SkipNegative Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 06/06/2021
 */
public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
