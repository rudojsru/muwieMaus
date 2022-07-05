package designPatterns.factory.Drink.DrinkCreator;

import designPatterns.factory.Drink.DrinkCreator.Abstract.DrinkCreator;
import designPatterns.factory.Drink.Drink;
import designPatterns.factory.Drink.Tea.Tea;

public class TeaCreater extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Tea();
    }

    @Override
    public Drink pourDrink(DrinkCreator types) {
        return null;
    }
}
