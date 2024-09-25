package homework4.ex2;

import java.util.HashSet;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(List.of("тон", "тополь", "боль", "рой", "стройка"));
        System.out.println(words.stream()
                .map(e -> e.length() - e.replace("о", "").length())
                .reduce(Integer::sum)
                .orElse(0));
    }
}
