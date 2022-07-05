package designPatterns.builder.Builder;

import designPatterns.builder.components.*;

import java.util.List;

public interface Builder {
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void setCheese(Cheese... cheese);
    void setMeat(Meat... meat);
    void setVegetables(Vegetables... vegetables);
    
}
