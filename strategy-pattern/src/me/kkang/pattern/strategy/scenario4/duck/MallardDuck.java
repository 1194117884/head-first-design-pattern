package me.kkang.pattern.strategy.scenario4.duck;

import me.kkang.pattern.strategy.scenario4.hehavior.FlyWithWings;
import me.kkang.pattern.strategy.scenario4.hehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("my head is green");
    }

}
