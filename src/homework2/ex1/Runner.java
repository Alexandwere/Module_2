package homework2.ex1;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Runner {
    public static void main(String[] args) {
        String filename = "luggage.csv";
        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
        int capacity = 10;
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            ArrayBlockingQueue <String> queue = new ArrayBlockingQueue<>(capacity);
            System.out.println("Начинается загрузка на ленту");

            for (int i = 0; i < capacity; i++) {
                queue.add(scanner.nextLine());
            }

            System.out.println("Лента загружена, начинается выдача багажа");

            for (int i = 0; i < capacity; i++) {
                String oneLuggage = queue.poll();
                System.out.println(Runner.numberLuggage(oneLuggage != null ? oneLuggage : scanner.next()) +
                        " - выдан");
            }
            System.out.println("Лента пустая, закончена выдача багажа!");
        }
        scanner.close();
    }

    public static String numberLuggage(String luggage) {
        String[] split = luggage.split(";");
        return split[0];
    }
}
