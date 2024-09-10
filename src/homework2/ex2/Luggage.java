package homework2.ex2;

import java.util.Objects;

public class Luggage {
    private final String numberLuggage;
    private final int weight;

    public Luggage(String numberLuggage, int weight) {
        this.numberLuggage = numberLuggage;
        this.weight = weight;
    }

    public String getNumberLuggage() {
        return numberLuggage;
    }

    public int getWeight() {
        return weight;
    }

}
