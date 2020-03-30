package me.kkang.pattern.strategy.scenario4.duck;

import me.kkang.pattern.strategy.scenario4.hehavior.FlyNoWay;
import me.kkang.pattern.strategy.scenario4.hehavior.MuteQuack;

public class ModelDuck extends Duck {


    public ModelDuck() {
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }


    @Override
    public void display() {
        System.out.println("my body is wooden");
    }
}