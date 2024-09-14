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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return id == feedback.id && countLikes == feedback.countLikes && Objects.equals(text, feedback.text) && Objects.equals(dateTime, feedback.dateTime);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
