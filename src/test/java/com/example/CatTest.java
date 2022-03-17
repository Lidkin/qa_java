package com.example;

import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;


public class CatTest {


    @Test
    public void catSoundShouldBe() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals("Это точно кошка?", "Мяу", cat.getSound());
    }

    @Test
    public void catFoodShouldBe() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals("Это кошачья еда?", List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }


}