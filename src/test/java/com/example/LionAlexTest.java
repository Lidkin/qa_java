package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {


    @Test
    public void lionAlexHasNoKittens() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец", new Feline());
        assertEquals(0, lionAlex.getKittens());
    }
    @Test
    public void lionAlexHasNoKittensWithError() throws Exception {
        LionAlex lionAlex = new LionAlex("Самка", new Feline());
        assertEquals(0, lionAlex.getKittens());
    }
    @Test
    public void doesHaveMane() throws Exception{
        LionAlex lionAlex = new LionAlex("Самец", new Feline());
        assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void doesHaveManeWithError() throws Exception{
        LionAlex lionAlex = new LionAlex("Самец", new Feline());
        assertFalse("У Алекса есть грива", lionAlex.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец", new Feline());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionAlex.getFood());
    }

    @Test
    public void getFriends() throws Exception{
        LionAlex lionAlex = new LionAlex("Самец", new Feline());
        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());

    }

    @Test
    public void getPlaceOfLiving() throws Exception{
        LionAlex lionAlex = new LionAlex("Самец", new Feline());
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}