package me.kkang.pattern.strategy.demo;

public class Main {

    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();

        System.out.println("----------");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
    }
}
