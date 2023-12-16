package com.srn.designPatterns.abstractFactory;

import com.srn.designPatterns.abstractFactory.factory.ProductFactory;

public class Client {
    public static void main(String[] args) {
        ProductFactory factory = ProductFactory.getProductFactory("Coffee");
        Product product = factory.getProduct("Latte");
        product.prepare();
    }
}
