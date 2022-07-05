package designPatterns.factory.Drink.DrinkCreator.Abstract;

import designPatterns.factory.Drink.Drink;
import designPatterns.factory.Drink.Enums.DrinkTypes;

public abstract class DrinkCreator {
    
    public abstract Drink pourDrink();
    public abstract Drink pourDrink(DrinkCreator types);
    
    public String displayMessage(){
        return  "Take Your ";
    }
 
}
