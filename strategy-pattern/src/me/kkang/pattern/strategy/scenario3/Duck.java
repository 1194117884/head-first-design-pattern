package me.kkang.pattern.strategy.scenario3;

/**
 * super class for ducks
 */
public abstract class Duck {


    /**
     * the duck display way
     */
    public abstract void display();

    public void swim() {
        System.out.println("I can swim !");
    }

    // other method ...
}
