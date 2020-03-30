package me.kkang.pattern.strategy.scenario4.hehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly !");
    }
}
