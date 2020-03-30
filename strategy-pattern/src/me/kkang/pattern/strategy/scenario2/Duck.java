package me.kkang.pattern.strategy.scenario2;

/**
 * super class for ducks
 */
public abstract class Duck {


    /**
     * the duck display way
     */
    public abstract void display();

    public void quack() {
        System.out.println("Ga Ga Ga ...");
    }

    public void swim() {
        System.out.println("I can swim !");
    }

    public void fly() {
        System.out.println("I can fly !");
    }

    // other method ...
}
