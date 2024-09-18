package homework3.ex1;

import homework3.ex1.fruit.Apple;
import homework3.ex1.fruit.Apricot;

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = () -> {
            System.out.println("Яблоко создается");
            return new Apple();
        };

        Garden<Apricot> apricotFarm = () -> {
            System.out.println("Абрикос создается");
            return new Apricot();
        };

        Apple apple = appleFarm.makeFruit();
        Apricot apricot = apricotFarm.makeFruit();
    }
}
