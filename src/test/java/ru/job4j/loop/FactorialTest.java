package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void fact1() {
        assertThat(Factorial.calc(5), is(120));
    }

    @Test
    public void fact2() {
        assertThat(Factorial.calc(0), is(1));
    }
}