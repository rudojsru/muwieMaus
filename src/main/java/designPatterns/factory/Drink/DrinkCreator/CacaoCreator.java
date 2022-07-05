package designPatterns.factory.Drink.DrinkCreator;

import designPatterns.factory.Drink.Coffe.Cacao;
import designPatterns.factory.Drink.Drink;
import designPatterns.factory.Drink.DrinkCreator.Abstract.DrinkCreator;
import designPatterns.factory.Drink.Enums.DrinkTypes;
import designPatterns.factory.Drink.Enums.TeaTypes;

public class CacaoCreator extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Cacao();
    }

    @Override
    public Drink pourDrink(DrinkCreator types) {
        return null;
    }

}
