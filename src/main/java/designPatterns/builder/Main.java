package designPatterns.builder;

import designPatterns.builder.Builder.Director;
import designPatterns.builder.Builder.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder=new PizzaBuilder();
        Director director= new Director();
        director.constructSeaPizza(builder);
        
        Pizza seaPizza =builder.getResult();
        System.out.println("Your order: "+seaPizza);
    }
    
    
}
