package com.srn.designPatterns.abstractFactory.coffee;

import com.srn.designPatterns.abstractFactory.Product;

public interface Coffee extends Product {
    void addSugar(int extraSugar);
    void addMilk(int extraML);
    void setQuantity(CoffeeSize size);
}
