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
Feline mockAlexFeline;

    @Test
    public void lionAlexHasNoKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(mockAlexFeline);
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception{
        LionAlex lionAlex = new LionAlex(mockAlexFeline);
        assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        LionAlex lionAlex = new LionAlex(mockAlexFeline);
        Mockito.when(mockAlexFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionAlex.getFood());
    }

    @Test
    public void getFriends() throws Exception{
        LionAlex lionAlex = new LionAlex(mockAlexFeline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());

    }

    @Test
    public void getPlaceOfLiving() throws Exception{
        LionAlex lionAlex = new LionAlex(mockAlexFeline);
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

}