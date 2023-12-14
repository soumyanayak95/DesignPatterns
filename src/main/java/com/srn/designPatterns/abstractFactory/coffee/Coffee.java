package com.srn.designPatterns.abstractFactory.coffee;

public interface Coffee {
    void addSugar(int extraSugar);
    void addMilk(int extraML);
    void setQuantity(CoffeeSize size);
}
