package homework3.ex5;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        String text1 = "Хороший товар";
        String text2 = "Не понравился";
        String text3 = "Пойдёт товар";
        String text4 = "Плохой товар";
        String text5 = "Отличный товар";

        Feedback firstFeedback1 = new Feedback(1, text1, 150,
                LocalDateTime.of(2024, 9, 23, 14, 30));
        Feedback firstFeedback2 = new Feedback(2, text2, 170,
                LocalDateTime.now());
        Feedback firstFeedback3 = new Feedback(3, text3, 100,
                LocalDateTime.now());
        Feedback firstFeedback4 = new Feedback(4, text4, 90,
                LocalDateTime.now());
        Feedback firstFeedback5 = new Feedback(5, text5, 100,
                LocalDateTime.of(2022, 1, 1, 11, 11));

        HashMap<Integer, Feedback> feedbackHashMap = new HashMap<>();
        feedbackHashMap.put(firstFeedback1.hashCode(), firstFeedback1);
        feedbackHashMap.put(firstFeedback2.hashCode(), firstFeedback2);
        feedbackHashMap.put(firstFeedback3.hashCode(), firstFeedback3);
        feedbackHashMap.put(firstFeedback4.hashCode(), firstFeedback4);
        feedbackHashMap.put(firstFeedback5.hashCode(), firstFeedback5);

        MyComparator myComparator = () -> {

        }


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
