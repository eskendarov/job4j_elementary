package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void sumEven1() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumEven2() {
        int rsl = Counter.sumByEven(5, 39);
        int expected = 374;
        assertThat(rsl, is(expected));
    }
}