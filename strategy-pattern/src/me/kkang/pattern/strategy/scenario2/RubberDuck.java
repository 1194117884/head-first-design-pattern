package me.kkang.pattern.strategy.scenario2;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("my body is rubber");
    }

    @Override
    public void quack() {
        System.out.println("Zhi Zhi Zhi ...");
    }

    @Override
    public void fly() {
        System.out.println("I can not fly !");
    }
}
