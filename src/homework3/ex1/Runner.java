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
    //Задание №1: Сад
    //Создать два класса, которые являются фруктами (намек на еще один класс): яблоко, абрикос.
    //(Без полей и методов).
    //Создать функциональный интерфейс сад, который умеет выращивать ФРУКТ и всех наследников фрукта.
    //Метод ничего не принимает.
    //Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
    //Яблочная ферма должна отдавать яблоко(не фрукт!), абрикосовая - абрикос(не фрукт!).
}
