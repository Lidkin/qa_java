package com.example;

import java.util.List;

public class LionAlex extends Lion {

    boolean hasMane;


    public LionAlex(String sex, Feline feline) throws Exception{
        super(sex, feline);
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else {
            throw new Exception("Алекс самец");
        }
    }


   @Override
   public int getKittens() {
        return 0;
   }

   @Override
    public boolean doesHaveMane() {
        return hasMane;
    }

    @Override
    public List<String> getFood() {
        return List.of("Животные", "Птицы", "Рыба");
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

}
