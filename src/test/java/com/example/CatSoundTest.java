package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatSoundTest {

     @Test
    public void catSound() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());

    }

}