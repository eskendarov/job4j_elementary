package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MultipleSwitchWeekTest {

    @Test
    public void test1() {
        Assert.assertThat(MultipleSwitchWeek.numberOfDay("Понедельник"),
                is(1));
    }

    @Test
    public void test2() {
        Assert.assertThat(MultipleSwitchWeek.numberOfDay("Foo"), is(-1));
    }

    @Test
    public void test3() {
        Assert.assertThat(MultipleSwitchWeek.numberOfDay("Friday"), is(5));
    }
}
