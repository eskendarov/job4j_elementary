package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void test1() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void test2() {
        int[] input = {7, 4, 0, 2};
        int[] expect = {7, 2, 0, 4};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expect));
    }
}