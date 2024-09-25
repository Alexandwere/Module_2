package homework4.ex3;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Runner {
    private static final int BOUND = 1000;
    private static final int MAX_LIMIT = 3;

    public static void main(String[] args) {

        Skyscrapper worldTradeCenter = new Skyscrapper("Всемирный торговый центр", 541);
        Skyscrapper chinaTower = new Skyscrapper("Шанхайская башня", 623);
        Skyscrapper burjTower = new Skyscrapper("Бурдж-Халифа", 828);
        Skyscrapper pinanTower = new Skyscrapper("Международный финансовый центр Пинань", 599);
        Skyscrapper abrajTower = new Skyscrapper("Абрадж аль-Бейт", 599);
        Skyscrapper lotteTower = new Skyscrapper("Всемирный центр Лотте", 555);

        ArrayList<Skyscrapper> skyscrappers = new ArrayList<>(List.of(worldTradeCenter, chinaTower, burjTower,
                pinanTower, abrajTower, lotteTower, burjTower));

        List<Skyscrapper> uniqueTowers = skyscrappers.stream().distinct().toList();
        uniqueTowers.stream().limit(MAX_LIMIT).forEach(System.out::println);

        System.out.println(uniqueTowers.stream().max(Skyscrapper::compareTo));

        List<Skyscrapper> skyscrapperList = uniqueTowers.stream().filter(e -> e.getHeight() > BOUND).toList();
        Optional<Skyscrapper> first = skyscrapperList.stream().findFirst();
        first.ifPresentOrElse(System.out::println,
                () -> System.out.println("Небоскреба выше километра - нет"));
    }
}
