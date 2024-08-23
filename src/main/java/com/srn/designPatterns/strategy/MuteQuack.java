package com.srn.designPatterns.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence ...  >>");
    }
}
