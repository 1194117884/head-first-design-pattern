package me.kkang.pattern.strategy.scenario1;

public class Main {

    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();

        System.out.println("----------");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
    }
}
