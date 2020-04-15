package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] arr) {
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                res = false;
                break;
            }
        }
        return res;
    }
}
