package me.kkang.pattern.strategy.scenario4.hehavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Ga Ga Ga ...");
    }
}
