package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SwitchWeekTest {

    @Test
    public void test1() {
        Assert.assertThat(SwitchWeek.nameOfDay(1), is("Понедельник"));
    }

    @Test
    public void test2() {
        Assert.assertThat(SwitchWeek.nameOfDay(77), is("Ошибка"));
    }

    @Test
    public void test3() {
        Assert.assertThat(SwitchWeek.nameOfDay(3), is("Среда"));
    }
}
