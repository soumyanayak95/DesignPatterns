package com.srn.designPatterns.abstractFactory.factory;

import com.srn.designPatterns.abstractFactory.Product;

public abstract class ProductFactory {
    public abstract Product getProduct(String subProductType);

    public static ProductFactory getProductFactory(String productType){
        switch (productType) {
            case "Coffee": return new CoffeeFactory();
            case "Shake": return new ShakeFactory();
            default:
                throw new IllegalStateException("Unexpected value: " + productType);
        }
    };
}