package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionAlexMockTest {

@Mock
Feline feline;

    @Test
    public void lionAlexHasNoKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(true, lionAlex.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionAlex.getFood());
    }

    @Test
    public void getFriends() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());

    }

    @Test
    public void getPlaceOfLiving() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

}