package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) { // переместить первую не null ячейку
                String cell = array[index];
                int point = index + 1; // указатель, на не null ячейку.
                while ((array[point] == null) && (point < array.length - 1)) { // Здесь нужен цикл while
                    point++;
                }
                array[index] = array[point];
                array[point] = cell;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
