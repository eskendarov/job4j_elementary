package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max1() {
        int out = new Max().maxNum(3, 2);
        assertThat(out, is(3));
    }

    @Test
    public void max2() {
        int out = new Max().maxNum(3, 2, 9);
        assertThat(out, is(9));
    }

    @Test
    public void max3() {
        int out = new Max().maxNum(3, 66, 33, 2);
        assertThat(out, is(66));
    }
}