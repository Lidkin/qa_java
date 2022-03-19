package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class FelineCountKittensWithParametersTest {

    private final int countKittens;
    private final int expected;

    public FelineCountKittensWithParametersTest(int countKittens, int expected) {
        this.countKittens = countKittens;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKitten() {
        return new Object[][] {
                { 0, 0},
                { 2, 2},
                { 1, 3},
        };
    }

    @Test
    public void countKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(countKittens);
        if (actual < 0 || expected < 0) {
            assertEquals("Котят должно быть больше 0", expected, actual);
        } else {
            assertEquals("Стоит пересчитать котят", expected, actual);
        }
    }

}
