package homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        Burning<Uran> reactor = (uran) -> System.out.println("Зеленый свет вокруг");
        Burning<Wood> bonfire = (wood) -> System.out.println("Жёлто-красный свет вокруг!");

        reactor.burning(new Uran());
        bonfire.burning(new Wood());
    }
}
