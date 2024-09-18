package homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Taro<String> camomile = (name) -> name.length() % 2 == 0;
        Taro<Human> granny = (human) -> (human.getAge() + human.getHeight()) > 210;

        System.out.println(camomile.taro("Юрий"));
        System.out.println(granny.taro(new Human(30, 170)));
    }
}
