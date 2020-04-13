package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 1;
        int y2 = 5;
        double expected = 2.2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.05);
    }
}