package model.entities.people;

import model.entities.elements.WorkSchedule;
import model.exceptions.ThereIsAnObjectAlreadyException;

import java.util.ArrayList;
import java.util.List;

public class Receptionist extends Employee {
    private List<WorkSchedule> workScheduleList;

    public Receptionist(String name, int id) {
        super(name, id);
        workScheduleList = new ArrayList<>();
    }

    public void addWorkload(WorkSchedule workSchedule){
        for (WorkSchedule ws : workScheduleList) {
            if(ws.equals(workSchedule)){
                throw new ThereIsAnObjectAlreadyException(workSchedule.getDay().name(), "work schedule list");
            }
        }

        workScheduleList.add(workSchedule);
    }

    public void removeWorkload(WorkSchedule workSchedule){
        workScheduleList.remove(workSchedule);
    }

    public String getWorkload(){
        StringBuilder result = new StringBuilder(" {");

        for (WorkSchedule workSchedule : workScheduleList) {
            result.append(workSchedule).append(", ");
        }

        result.replace(result.length() - 2, result.length() - 1, "}");

        if(workScheduleList.size() == 0){
            result.append("}");
        }

        return result.toString();
    }
}
