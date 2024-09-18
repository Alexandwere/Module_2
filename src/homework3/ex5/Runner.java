package homework3.ex5;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashMap;
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

        List<Feedback> feedbackLinkedList = new LinkedList<>();
        feedbackLinkedList.add(feedback1);
        feedbackLinkedList.add(feedback2);
        feedbackLinkedList.add(feedback3);
        feedbackLinkedList.add(feedback4);
        feedbackLinkedList.add(feedback5);

        Comparator<Feedback> comparator = (one, two) -> {
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

        feedbackLinkedList.sort(comparator);
        System.out.println((feedbackLinkedList));




        //Задание №5: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
        //Создать коллекцию, которая хранит отсортированные отзывы по:
        // 1.лайкам
        // 2.(Если лайки совпадают) дата + время отзыва
        // 3.(Если лайки и дата + время отзыва совпадают) id

        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
    }
}
