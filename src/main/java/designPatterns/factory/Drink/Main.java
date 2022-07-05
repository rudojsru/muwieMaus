package designPatterns.factory.Drink;

import designPatterns.factory.Drink.DrinkCreator.Abstract.DrinkCreator;
import designPatterns.factory.Drink.DrinkCreator.CoffeCreater;
import designPatterns.factory.Drink.DrinkCreator.TeaCreater;
import designPatterns.factory.Drink.Enums.CoffeTypes;

public class Main {
    

    public static void main(String[] args) {
        DrinkCreator drinkCreator= new TeaCreater();

        System.out.println(drinkCreator.displayMessage());
        drinkCreator.pourDrink();
        
        DrinkCreator coffeCreator= new CoffeCreater();
        System.out.println(coffeCreator.displayMessage());
        coffeCreator.pourDrink();

        System.out.println(coffeCreator.displayMessage());
        coffeCreator.pourDrink();
    }
    
}
