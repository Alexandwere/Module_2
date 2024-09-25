package homework4.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static homework4.ex1.Region.*;

public class Runner {
    private static final int LOW = 40;
    private static final int TOP = 50;

    public static void main(String[] args) {
        List<Car> carList1 = new ArrayList<>();
        List<Car> carList2 = new ArrayList<>();

        AtomicInteger number = new AtomicInteger(0);
        Stream.generate(() -> number.addAndGet(1))
                .limit(50)
                .forEach(e -> {
                    carList1.add(new Car(e, MOSCOW.getRegion()));
                    carList2.add(new Car(e, SPB.getRegion()));
                });

        Stream.concat(carList1.stream(), carList2.stream())
                .filter(e -> e.getPartNum() >= LOW && e.getPartNum() < TOP)
                .forEach(System.out::println);
    }
}
