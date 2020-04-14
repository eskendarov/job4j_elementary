package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void exist1() {
        assertThat(Triangle.exist(2.0, 2.0, 2.0), is(true));
    }

    @Test
    public void exist2() {
        assertThat(Triangle.exist(0, 2.0, 2.0), is(false));
    }
}