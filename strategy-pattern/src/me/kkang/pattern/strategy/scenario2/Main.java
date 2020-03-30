package me.kkang.pattern.strategy.scenario2;

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

        System.out.println("----------");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
        System.out.println("----------");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.quack();
        decoyDuck.swim();
        decoyDuck.fly();
    }
}
