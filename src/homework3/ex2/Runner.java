package homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Taro<String> camomile = (name) -> name.length() % 2 == 0;
        Taro<Human> granny = (human) -> (human.getAge() + human.getHeight()) > 210;

        System.out.println(camomile.taro("Юрий"));
        System.out.println(granny.taro(new Human(30, 170)));

        //Задание №2: Поиск пары с помощью гадания
        //Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст, рост),
        //возвращает да - если (возраст + рост) больше 210, нет - если меньше или равно
    }
}
