package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void area1() {
        double out = (new Triangle(new Point(2, 4), new Point(4, 2), new Point(0, 3))).area();
        System.out.println(out);
        Assert.assertEquals(out, 2.99, 0.01);
    }

    @Test
    public void area2() {
        double out = (new Triangle(new Point(2, 4), new Point(2, 4), new Point(0, 3))).area();
        System.out.println(out);
        Assert.assertEquals(out, -1, 0.0);
    }
}