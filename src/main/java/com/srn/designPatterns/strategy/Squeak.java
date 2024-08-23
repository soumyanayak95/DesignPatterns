package com.srn.designPatterns.strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeeeak Squeeeeak");
    }
}
