package me.kkang.pattern.strategy.demo;

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

    // other method ...
}
