package me.kkang.pattern.strategy.scenario4.hehavior;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly with rocket engine !");
    }
}
