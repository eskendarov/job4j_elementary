package ru.job4j.condition;

/**
 * ChessBoard Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 06/06/2021
 */
public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (checkBounds(x1) && checkBounds(y1)
                && checkBounds(x2) && checkBounds(y2)) {
            int h = Math.abs(x1 - x2);
            int v = Math.abs(y1 - y2);
            return h == v ? h : 0;
        }
        return 0;
    }

    public static boolean checkBounds(int val) {
        return val > -1 && val < 8;
    }
}
