package com.example;

import java.util.List;

public class LionAlex extends Lion {


    private static final String sex = "Самец";


    public LionAlex(Feline feline) throws Exception {
        super(sex, feline);
        }


   @Override
   public int getKittens() {
        return 0;
   }

   @Override
    public boolean doesHaveMane() {

        return hasMane = true;
    }


    public List<String> getFood() throws Exception {
        return super.getFood();
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

}
