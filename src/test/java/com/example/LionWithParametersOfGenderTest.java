package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionWithParametersOfGenderTest {
    private final String lionSex;


    public LionWithParametersOfGenderTest(String lionSex) {
        this.lionSex = lionSex;

    }

    @Parameterized.Parameters
    public static Object[][] getLionGender() {
        return new Object[][]{
                {"Самка"},
                {"Самец"},
                {"не определено"},
        };
    }


    @Test
    public void lionDoesHaveMane() throws Exception {
        Lion lion = new Lion(lionSex, new Feline());
        assertEquals(true, lion.doesHaveMane());

    }

    @Test
    public void lionFood() throws Exception {
        Lion lion = new Lion(lionSex, new Feline());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}
