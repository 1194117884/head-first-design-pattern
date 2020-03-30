package me.kkang.pattern.strategy.scenario4.hehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Zhi Zhi Zhi ...");
    }

}
