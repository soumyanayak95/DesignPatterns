package com.srn.designPatterns.abstractFactory.shake;

import com.srn.designPatterns.abstractFactory.coffee.CoffeeSize;

public class BananaShake implements Shake{
    @Override
    public void addSugar(int extraSugar) {

    }

    @Override
    public void addMilk(int extraML) {

    }

    @Override
    public void setQuantity(CoffeeSize size) {

    }

    @Override
    public void setFruit(FruitType fruit) {

    }

    @Override
    public void prepare() {
        System.out.println("Banana shake is ready!!!");
    }
}
