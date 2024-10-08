package homework2.ex2;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        String filename = "luggage.csv";
        final String lightType = "Лёгкие";
        final String middleType = "Средние";
        final String heavyType = "Тяжелые";
        Scanner scanner = new Scanner(homework2.ex1.Runner.class.getClassLoader().getResourceAsStream(filename));
        scanner.nextLine();
        GroupLuggage groupLuggage = new GroupLuggage();

        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(";");
            Luggage luggage = new Luggage(split[0], Integer.parseInt(split[1]));
            groupLuggage.addLuggage(luggage);
        }

        List<Luggage> light = groupLuggage.getCategories()[0];
        List<Luggage> middle = groupLuggage.getCategories()[1];
        List<Luggage> heavy = groupLuggage.getCategories()[2];

        result(lightType, light);
        result(middleType, middle);
        result(heavyType, heavy);

        scanner.close();
    }

    public static String result(String type, List<Luggage> group) {
        int sum = 0;
        for (Luggage luggage : group) {
            sum += luggage.getWeight();
        }
        return type + " = " + sum;
    }
}
