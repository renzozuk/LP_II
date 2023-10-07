package model.entities.elements;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Workout {
    final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
    private LocalTime time;
    private String activity;

    public Workout(String time, String activity) {
        this.time = LocalTime.parse(time, timeFormat);
        this.activity = activity;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return Objects.equals(time, workout.time) && Objects.equals(activity, workout.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, activity);
    }

    @Override
    public String toString() {
        return time + "=" + activity;
    }
}
