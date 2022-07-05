package designPatterns.factory.Drink.DrinkCreator;

import designPatterns.factory.Drink.Coffe.Cacao;
import designPatterns.factory.Drink.Coffe.Expresso;
import designPatterns.factory.Drink.DrinkCreator.Abstract.DrinkCreator;
import designPatterns.factory.Drink.Coffe.Coffe;
import designPatterns.factory.Drink.Drink;
import designPatterns.factory.Drink.Enums.CoffeTypes;
import designPatterns.factory.Drink.Enums.DrinkTypes;

public class CoffeCreater extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Coffe();
    }

    @Override
    public Drink pourDrink(DrinkCreator types) {
        Drink coffe=null ;
//        switch ((CoffeTypes) types){
//            case BLACK:  coffe = new Expresso();
//            break;
//            case GREEN:coffe= new Cacao();
//                break;
//            case WHITE:coffe= new Cacao();
//                break;
//            case CACAO:  coffe= new Cacao();
//            break;
//        }
        return coffe;
    }

 
}
