package com.srn.designPatterns.abstractFactory.shake;

import com.srn.designPatterns.abstractFactory.Product;
import com.srn.designPatterns.abstractFactory.coffee.CoffeeSize;

public interface Shake extends Product {
    void addSugar(int extraSugar);
    void addMilk(int extraML);
    void setQuantity(CoffeeSize size);
    void setFruit(FruitType fruit);
}
