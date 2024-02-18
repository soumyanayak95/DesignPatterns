package com.srn.designPatterns.abstractFactory.coffee;

public class Espresso implements Coffee{

    int sugarBySpoon = 2;
    int milkByML = 60;
    CoffeeSize coffeeSize = CoffeeSize.SMALL;

    @Override
    public void addSugar(int extraSugar) {
        this.sugarBySpoon += extraSugar;
    }

    @Override
    public void addMilk(int extraML) {
        this.milkByML += extraML;
    }

    @Override
    public void setQuantity(CoffeeSize size) {
        this.coffeeSize = size;
    }

    @Override
    public void prepare() {
        System.out.println("Espresso is ready!!!");
    }
}
