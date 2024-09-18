package homework3.ex5;

import java.time.LocalDateTime;
import java.util.Objects;

public class Feedback {
    private int id;
    private String text;
    private int countLikes;
    private LocalDateTime dateTime;

    public Feedback(int id, String text, int countLikes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.countLikes = countLikes;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "\nОтзыв №1: " + id + ", " + text + ", " + countLikes + ", " + dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getCountLikes() {
        return countLikes;
    }
}
