package me.kkang.pattern.strategy.scenario3;

public class Main {

    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("----------");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("----------");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        System.out.println("----------");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
    }
}
