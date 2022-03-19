package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionCountKittensWithParametersTest {

    private final int expected;

    public LionCountKittensWithParametersTest(int expected) {
          this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKitten() {
        return new Object[][] {
                { 0 },
                { 2 },
                { 1 },
        };
    }

    @Test
    public void countKittensTest() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        int actual = lion.getKittens();
        if (actual < 0 || expected < 0) {
            assertEquals("Котят должно быть больше 0", expected, actual);
        } else {
            assertEquals("Стоит пересчитать котят", expected, actual);
        }
    }

  }