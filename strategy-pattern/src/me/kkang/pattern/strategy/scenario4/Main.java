package me.kkang.pattern.strategy.scenario4;

import me.kkang.pattern.strategy.scenario4.duck.*;
import me.kkang.pattern.strategy.scenario4.hehavior.FlyWithRocket;

public class Main {

    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println("----------");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("----------");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("----------");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println("----------");

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();

    }
}
