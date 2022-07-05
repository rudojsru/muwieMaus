package designPatterns.builder.Builder;

import designPatterns.builder.components.*;

public class Director {
    
    public void constructSeaPizza(Builder builder){
        builder.setCheese(Cheese.CHEESE_1,Cheese.CHEESE_3);
        builder.setMeat(Meat.MEET_1,Meat.MEET_2);
        builder.setDough(Dough.THICK);
        builder.setSauce(Sauce.SOUSE_1);
      //  builder.setVegetables(Vegetables.VEGETABLES_1,Vegetables.VEGETABLES_4);
    }

 
    
}
