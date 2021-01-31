package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert1000rubleThen14Euro() {
        int in = 1000;
        int expected = 14;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert1000rubleThen16Dollar() {
        int in = 1000;
        int expected = 16;
        int out = Converter.rubleTooDollar(in);
        Assert.assertEquals(expected, out);
    }
}