package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void test1() {
        FindLoop find = new FindLoop();
        int result = find.indexOf(new int[]{5, 10, 3}, 5);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void test2() {
        FindLoop find = new FindLoop();
        int result = find.indexOf(new int[]{5, 10, 3}, 9);
        int expect = -1;
        assertThat(result, is(expect));
    }
}