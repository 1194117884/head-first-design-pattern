package me.kkang.pattern.strategy.scenario4.duck;

import me.kkang.pattern.strategy.scenario4.hehavior.FlyNoWay;
import me.kkang.pattern.strategy.scenario4.hehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("my body is rubber");
    }
}
