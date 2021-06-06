package ru.job4j.array;

/**
 * PrintEvenElements Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 06/06/2021
 */
public class PrintEvenElements {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(
                "Элементы массива начиная с последнего с четными индексами:"
        );
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers.length - i - 1;
            if (index % 2 == 0) {
                System.out.printf("%d-й элемент массива: %d%s",
                        index, numbers[index], System.lineSeparator());
            }
        }
    }
}
