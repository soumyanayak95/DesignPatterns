package com.srn.designPatterns.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Duck mallard = new Mallard();
        mallard.quack();
        mallard.fly();
        mallard.display();
    }
}
