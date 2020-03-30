package me.kkang.pattern.strategy.scenario3;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("my head is green");
    }

    @Override
    public void fly() {
        System.out.println("I can fly !");
    }

    @Override
    public void quack() {
        System.out.println("Ga Ga Ga ...");
    }
}
