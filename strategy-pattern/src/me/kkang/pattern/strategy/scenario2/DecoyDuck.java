package me.kkang.pattern.strategy.scenario2;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("my body is wooden");
    }

    @Override
    public void quack() {
        System.out.println("I can not quack !");
    }

    @Override
    public void fly() {
        System.out.println("I can not fly !");
    }
}
