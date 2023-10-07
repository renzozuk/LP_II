package model.entities.elements;

import model.exceptions.NotValidWorkdayException;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class WorkSchedule {
    final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
    private DayOfWeek day;
    private LocalTime entranceTime;
    private LocalTime exitTime;

    public WorkSchedule(DayOfWeek day, String entranceTime, String exitTime){
        if(day == DayOfWeek.SUNDAY){
            throw new NotValidWorkdayException();
        }
        this.day = day;
        this.entranceTime = LocalTime.parse(entranceTime, timeFormat);
        this.exitTime = LocalTime.parse(exitTime, timeFormat);
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public LocalTime getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(LocalTime entranceTime) {
        this.entranceTime = entranceTime;
    }

    public LocalTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkSchedule that = (WorkSchedule) o;
        return day == that.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day);
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        switch(day){
            case MONDAY:
                result.append("Segunda: ");
                break;
            case TUESDAY: 
                result.append("Terça: ");
                break;
            case WEDNESDAY:
                result.append("Quarta: ");
                break;
            case THURSDAY:
                result.append("Quinta: ");
                break;
            case FRIDAY:
                result.append("Sexta: ");
                break;
            case SATURDAY:
                result.append("Sábado: ");
                break;
            default:
                throw new NotValidWorkdayException();
        };
        result.append(entranceTime).append(" - ").append(exitTime);
        return result.toString();
    }
}
