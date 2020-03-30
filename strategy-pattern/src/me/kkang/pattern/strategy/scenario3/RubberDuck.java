package me.kkang.pattern.strategy.scenario3;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("my body is rubber");
    }

    @Override
    public void quack() {
        System.out.println("Zhi Zhi Zhi ...");
    }
}
