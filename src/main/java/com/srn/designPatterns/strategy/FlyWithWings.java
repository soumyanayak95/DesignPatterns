package com.srn.designPatterns.strategy;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I fly with features!!");
    }
}
