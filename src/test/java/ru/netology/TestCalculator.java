package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    Ints calc = new IntsCalculator();

    @Test
    public void testSum() {
        int resultSum = calc.sum(23, 32);
        int expectedSum = 55;
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void testMult() {
        int resultMult = calc.mult(20, 12);
        int expectedMult = 240;
        Assertions.assertEquals(expectedMult, resultMult);
    }

    @Test
    public void testPow() {
        int resultPow = calc.pow(10, 2);
        int expectedPow = 100;
        Assertions.assertEquals(expectedPow, resultPow);
    }
}
