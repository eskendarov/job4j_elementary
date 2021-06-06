package ru.job4j.array;

/**
 * MatrixSum Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 06/06/2021
 */
public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl = rsl + array[row][cell];
            }
        }
//        for (int[] rows : array) {
//            for (int cell : rows) {
//                rsl = rsl + cell;
//            }
//        }
        return rsl;
    }
}
