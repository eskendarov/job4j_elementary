package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int posLeft = 0;
        int posRight = 0;
        int posRsl = 0;
        while (posLeft + posRight < rsl.length) {
            if (posLeft < left.length && posRight < right.length) {
                if (left[posLeft] < right[posRight]) {
                    rsl[posRsl] = left[posLeft++];
                } else {
                    rsl[posRsl] = right[posRight++];
                }
            } else if (posLeft < left.length) {
                rsl[posRsl] = left[posLeft++];
            } else if (posRight < right.length) {
                rsl[posRsl] = right[posRight++];
            }
            posRsl++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
