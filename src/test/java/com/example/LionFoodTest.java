package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;



public class LionFoodTest {


    @Test
    public void lionFood() throws Exception {

        List<String> Gender = List.of("Самка","Самец");
        Lion lion = new Lion(Gender.get(0), new Feline());
        Lion lionMale = new Lion(Gender.get(1), new Feline());

        if (lionMale.getFood()==lion.getFood()) {
            assertEquals(List.of("Животные", "Птицы", "Рыба"), lionMale.getFood());
        }
    }

}