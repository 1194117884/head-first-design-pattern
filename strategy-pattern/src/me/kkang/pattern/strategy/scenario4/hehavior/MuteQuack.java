package me.kkang.pattern.strategy.scenario4.hehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("no voice !");
    }

}
