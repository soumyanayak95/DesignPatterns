package com.srn.designPatterns.abstractFactory.shake;

import com.srn.designPatterns.abstractFactory.coffee.CoffeeSize;

public interface Shake {
    void addSugar(int extraSugar);
    void addMilk(int extraML);
    /*
        TODO
        Create a common enum of size
     */
    void setQuantity(CoffeeSize size);
    void setFruit(FruitType fruit);
}
