package me.kkang.pattern.strategy.scenario4.duck;

import me.kkang.pattern.strategy.scenario4.hehavior.FlyBehavior;
import me.kkang.pattern.strategy.scenario4.hehavior.QuackBehavior;

/**
 * super class for ducks
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * the duck display way
     */
    public abstract void display();

    public void swim() {
        System.out.println("I can swim !");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // other method ...
}
