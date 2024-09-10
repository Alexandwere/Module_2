package homework2.ex2;

import java.util.ArrayList;
import java.util.List;

public class GroupLuggage {
    private List[] category;
    private final int countCategory = 3;

    public GroupLuggage() {
        category = new List[countCategory];
        for (int i = 0; i < countCategory; i++) {
            category[i] = new ArrayList<>();
        }
    }

    public void addLuggage(Luggage luggage) {
        if (luggage.getWeight() < 5) {
            category[0].add(luggage);
        } else if (luggage.getWeight() < 10) {
            category[1].add(luggage);
        } else category[2].add(luggage);
    }

    public List<Luggage>[] getCategories() {
        return category;
    }

    public int getCountCategory() {
        return countCategory;
    }
}
