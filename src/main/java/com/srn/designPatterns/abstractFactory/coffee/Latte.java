package com.srn.designPatterns.abstractFactory.coffee;

public class Latte implements Coffee{
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
    public void prepare() {
        System.out.println("Latte is ready!!!");
    }
}
