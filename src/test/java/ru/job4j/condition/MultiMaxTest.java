package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void maxNum1() {
        assertThat(MultiMax.max(2, 5, 4), is(5));
    }

    @Test
    public void maxNum2() {
        assertThat(MultiMax.max(4, 2, 7), is(7));
    }
}