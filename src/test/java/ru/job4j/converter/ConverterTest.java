package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        int in = 0;
        int expected = 0;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 2;
        int expected = 120;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}