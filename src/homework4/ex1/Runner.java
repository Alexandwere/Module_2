package homework4.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static homework4.ex1.Region.*;

public class Runner {
    private static final int LOW = 40;
    private static final int TOP = 50;
1
    public static void main(String[] args) {
        List<Car> carList1 = new ArrayList<>();
        List<Car> carList2 = new ArrayList<>();

        AtomicInteger number = new AtomicInteger(0);
        List<Integer> count = Stream.generate(() -> number.addAndGet(1))
                .limit(50)
                .toList();

        count.forEach(e -> {
            carList1.add(new Car(e, MOSCOW.getRegion()));
            carList2.add(new Car(e, SPB.getRegion()));
        });

        Stream<Car> carsStream1 = carList1.stream();
        Stream<Car> carsStream2 = carList2.stream();
        Stream<Car> allCarsStream = Stream.concat(carsStream1, carsStream2);
        allCarsStream.filter(e -> e.getPartNum() >= LOW && e.getPartNum() < TOP).forEach(System.out::println);
    }
}
