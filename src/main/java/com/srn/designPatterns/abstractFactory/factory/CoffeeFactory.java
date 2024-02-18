package com.srn.designPatterns.abstractFactory.factory;

import com.srn.designPatterns.abstractFactory.Product;
import com.srn.designPatterns.abstractFactory.coffee.Espresso;
import com.srn.designPatterns.abstractFactory.coffee.Latte;

public class CoffeeFactory extends ProductFactory{

    @Override
    public Product getProduct(String coffeeType) {
        switch (coffeeType) {
            case "Latte": return new Latte();
            case "Espresso": return new Espresso();
            default:
                throw new IllegalStateException("Unexpected value: " + coffeeType);
        }
    }
}
