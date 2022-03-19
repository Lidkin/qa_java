package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatFamilyTypeOneKittenHaveMockTest {

    Feline feline = new Feline();

    @Mock
    Animal animal;

    @Test
    public void eatMeat() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = animal.getFood("Хищник");
        assertEquals("Ожидается иной список питания", food, feline.eatMeat());
    }

    @Test
       public void eatMoreMeat() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба", "Растения"));
        List<String> moreFood = animal.getFood("Хищник");
        assertEquals("Ожидается иной список питания", moreFood, feline.eatMeat());
    }


    @Mock
    Feline felineMock;

    @Test
    public void familyType() {
        Mockito.when(felineMock.getFamily()).thenReturn("Кошачьи");
        assertEquals("Ожидается семейство кошачьих",felineMock.getFamily(), feline.getFamily());
        System.out.println(animal.getFamily());
    }


    @Test
    public void otherFamilyType() {
        Mockito.when(felineMock.getFamily()).thenReturn("Заячьи");
        assertEquals("Ожидается семейство кошачьи", felineMock.getFamily(), feline.getFamily());

    }


    @Test
    public void oneKittenHave() {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        assertEquals(felineMock.getKittens(), feline.getKittens());

    }


 }
