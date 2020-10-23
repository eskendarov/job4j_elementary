package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void square2() {
        int p = 6;
        int k = 3;
        double expected = 0.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.05);
    }
}