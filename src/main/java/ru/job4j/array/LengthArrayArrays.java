package ru.job4j.array;

/**
 * LengthArrayArrays Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 06/06/2021
 */
public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
