package homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> januaryTemp = List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10 ,
                -5 , -5, -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1);

        List<Integer> februaryTemp = List.of(-8 , -10, -12, -13, -15, -16, -12, -7,
                -8, -10, -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1);

        ArrayList<Integer> twoMonths = new ArrayList<>();
        twoMonths.addAll(januaryTemp);
        twoMonths.addAll(februaryTemp);
        double sumTemp = 0;

        for (double number : twoMonths) {
            sumTemp += number;
        }

        double averageTemp = sumTemp / twoMonths.size();

        System.out.println("Средняя температура за 2 месяца = " + Math.round(averageTemp * 100.0) / 100.0);

    }
}
