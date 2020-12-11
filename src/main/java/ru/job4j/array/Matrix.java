package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Matrix {

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                builder.append(table[i][j] = (i + 1) * (j + 1));
            }
            builder.append(System.lineSeparator());
        }
        try (OutputStream out = new FileOutputStream("result.txt")) {
            out.write(builder.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return table;
    }
}
