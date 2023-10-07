package application;

import model.entities.elements.WorkSchedule;
import model.entities.elements.Workout;
import model.entities.people.BodybuildingCoach;
import model.entities.people.Customer;
import model.entities.people.PersonalTrainer;
import model.entities.people.Receptionist;
import model.entities.people.SwimmingTeacher;
import model.dao.GymDatabase;
import java.time.DayOfWeek;

public class Program {
    public static void main(String[] args) {
        GymDatabase gdb = new GymDatabase();

        Receptionist rg = new Receptionist("Ryan Gosling", gdb.getEmployeeListSize() + 1);
        gdb.addEmployeeToList(rg);
        rg.addWorkload(new WorkSchedule(DayOfWeek.MONDAY, "05:30", "13:30"));
        rg.addWorkload(new WorkSchedule(DayOfWeek.TUESDAY, "05:30", "13:30"));
        rg.addWorkload(new WorkSchedule(DayOfWeek.WEDNESDAY, "05:30", "13:30"));
        rg.addWorkload(new WorkSchedule(DayOfWeek.THURSDAY, "05:30", "13:30"));
        rg.addWorkload(new WorkSchedule(DayOfWeek.FRIDAY, "05:30", "13:30"));
        rg.addWorkload(new WorkSchedule(DayOfWeek.SATURDAY, "05:30", "13:30"));

        Receptionist yt = new Receptionist("Yoshio Takahashi", gdb.getEmployeeListSize() + 1);
        gdb.addEmployeeToList(yt);
        yt.addWorkload(new WorkSchedule(DayOfWeek.MONDAY, "13:30", "21:30"));
        yt.addWorkload(new WorkSchedule(DayOfWeek.TUESDAY, "13:30", "21:30"));
        yt.addWorkload(new WorkSchedule(DayOfWeek.WEDNESDAY, "13:30", "21:30"));
        yt.addWorkload(new WorkSchedule(DayOfWeek.THURSDAY, "13:30", "21:30"));
        yt.addWorkload(new WorkSchedule(DayOfWeek.FRIDAY, "13:30", "21:30"));
        yt.addWorkload(new WorkSchedule(DayOfWeek.SATURDAY, "13:30", "21:30"));

        PersonalTrainer mw = new BodybuildingCoach("Maria van Wyk", gdb.getEmployeeListSize() + 1);
        gdb.addEmployeeToList(mw);
        Customer jp = new Customer("Johannes Petersen", "000.000.000-00", "05/02/1992");
        mw.addCustomerToList(jp);
        jp.addExerciseToWorkoutList(new Workout("10:00", "Hipertrofia"));
        jp.addExerciseToWorkoutList(new Workout("11:00", "Ergometria"));

        PersonalTrainer as = new SwimmingTeacher("Anna Smith", gdb.getEmployeeListSize() + 1);
        gdb.addEmployeeToList(as);
        Customer hc = new Customer("Hendrik Coetzee", "111.111.111-11", "01/07/1989");
        as.addCustomerToList(hc);
        hc.addExerciseToWorkoutList(new Workout("08:00", "Nado de costas"));
        hc.addExerciseToWorkoutList(new Workout("07:00", "Nado Livre"));
        hc.addExerciseToWorkoutList(new Workout("09:00", "Nado Borboleta"));

        gdb.printReport();
    }
}
