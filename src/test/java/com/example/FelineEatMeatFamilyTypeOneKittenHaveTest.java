package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;



public class FelineEatMeatFamilyTypeOneKittenHaveTest {
    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {

        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test(expected = Exception.class)
    public void  eatMeatException() throws Exception {
        feline.getFood("Всеядное");
    }

    @Test
    public void familyType() {

        assertEquals( "Кошачьи", feline.getFamily());
    }

    @Test
    public void oneKittenHave() {

        assertEquals( 1, feline.getKittens());
    }

 }
