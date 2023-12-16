package com.srn.designPatterns.abstractFactory.factory;

import com.srn.designPatterns.abstractFactory.Product;
import com.srn.designPatterns.abstractFactory.coffee.Espresso;
import com.srn.designPatterns.abstractFactory.coffee.Latte;

public class ShakeFactory extends ProductFactory{
    @Override
    public Product getProduct(String shakeType) {
        switch (shakeType) {
            case "Latte": return new Latte();
            case "Espresso": return new Espresso();
            default:
                throw new IllegalStateException("Unexpected value: " + shakeType);
        }
    }
}
