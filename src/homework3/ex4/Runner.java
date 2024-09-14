package homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Ruller<Animal> animalRuller = (animal) -> animal.getBodyLength() + animal.getTailLength();
        Ruller<Boat> boatRuller = (boat) -> boat.getBoatLength();

        System.out.println(animalRuller.measures(new Animal(15, 7.5)));
        System.out.println(boatRuller.measures(new Boat(3600)));

        //Задание №4: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать класс животное (длина тела, длина хвоста)
        //Создать класс лодка(длина)
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка, возвращает длину лодки
        //Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста
    }
}
