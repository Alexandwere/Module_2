package homework3.ex5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String text1 = "Хороший товар";
        String text2 = "Не понравился";
        String text3 = "Пойдёт товар";
        String text4 = "Плохой товар";
        String text5 = "Отличный товар";

        Feedback feedback1 = new Feedback(1, text1, 200,
                LocalDateTime.of(2024, 9, 23, 14, 30));
        Feedback feedback2 = new Feedback(2, text2, 70,
                LocalDateTime.of(2024, 9, 23, 14, 30));
        Feedback feedback3 = new Feedback(3, text3, 100,
                LocalDateTime.of(2024, 9, 23, 14, 30));
        Feedback feedback4 = new Feedback(4, text4, 100,
                LocalDateTime.of(2024, 9, 23, 14, 30));
        Feedback feedback5 = new Feedback(5, text5, 100,
                LocalDateTime.now());

        List<Feedback> feedbackLinkedList = new ArrayList<>(List.of(feedback1, feedback2, feedback3, feedback4,
                feedback5));

        Comparator<Feedback> myComparator = (one, two) -> {
            if (one.getCountLikes() > two.getCountLikes()) {
                return -1;
            }
            if (one.getCountLikes() < two.getCountLikes()) {
                return 1;
            }
            if (one.getCountLikes() == two.getCountLikes()) {
                if (one.getDateTime().isAfter(two.getDateTime())) {
                    return -1;
                }
                if (one.getDateTime().isBefore(two.getDateTime())) {
                    return 1;
                }
                if (one.getDateTime().isEqual(two.getDateTime())) {
                    if (one.getId() > two.getId()) {
                        return -1;
                    }
                    if (one.getId() < two.getId()) {
                        return 1;
                    }
                    if (one.getId() == two.getId()) {
                        return 0;
                    }
                }
            }
            return 0;
        };

        feedbackLinkedList.sort(myComparator);
        System.out.println(feedbackLinkedList.toString().replaceAll("^\\[|]$", ""));
    }
}
