package me.kkang.pattern.strategy.scenario4.hehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly with my wings !");
    }
}
