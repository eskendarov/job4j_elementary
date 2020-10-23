package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.05);
    }

    @Test
    public void distance3d() {
        double expected = 25.5;
        Point a = new Point(23, 23, 21);
        Point b = new Point(12, 22, 44);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.05);
    }
}