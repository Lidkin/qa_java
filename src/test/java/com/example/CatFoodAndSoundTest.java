package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatFoodAndSoundTest {

    Cat cat = new Cat(new Feline());

    @Test
    public void catFood() throws Exception {

        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }

    @Test
    public void catSound() {

        assertEquals("Мяу", cat.getSound());

    }

}