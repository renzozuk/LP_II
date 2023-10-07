package model.entities.people;

import model.entities.elements.Workout;
import model.exceptions.NotValidCPFException;
import model.exceptions.ThereIsAnObjectAlreadyException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String name;
    private String cpf;
    private LocalDate dateOfBirth;
    private List<Workout> workoutList;

    public Customer(String name, String cpf, String dateOfBirth) {
        Pattern pattern = Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}|\\d{11}");
        Matcher matcher = pattern.matcher(cpf);

        if(!matcher.matches()){
            throw new NotValidCPFException(cpf);
        }

        this.name = name;
        this.cpf = cpf;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, dtf);
        workoutList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addExerciseToWorkoutList(Workout workout){
        for (Workout w : workoutList) {
            if(w.equals(workout)){
                throw new ThereIsAnObjectAlreadyException(workout.getActivity(), "workout list");
            }
        }
        workoutList.add(workout);
    }

    public void removeExerciseFromWorkoutList(Workout workout){
        workoutList.remove(workout);
    }

    public String getWorkoutList(){
        StringBuilder result = new StringBuilder("Aluno >>> " + getName() + " {");

        for (Workout workout : workoutList) {
            result.append(workout).append(", ");
        }

        result.replace(result.length() - 2, result.length() - 1, "}");

        if(workoutList.size() == 0){
            result.append("}");
        }

        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(cpf, customer.cpf) && Objects.equals(dateOfBirth, customer.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, dateOfBirth);
    }

    @Override
    public String toString(){
        return "CPF: " + cpf + " | Nome: " + name + " | Data de nascimento: " + dateOfBirth.format(dtf);
    }
}
