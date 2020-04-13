package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max1() {
        assertThat(Max.maxNum(3, 2), is(3));
    }

    @Test
    public void max2() {
        assertThat(Max.maxNum(2, 5), is(5));
    }

    @Test
    public void max3() {
        assertThat(Max.maxNum(4, 4), is(4));
    }
}