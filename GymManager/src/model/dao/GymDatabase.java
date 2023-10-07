package model.dao;

import model.entities.people.Employee;
import model.entities.people.PersonalTrainer;
import model.entities.people.Receptionist;
import java.util.ArrayList;
import java.util.List;

public class GymDatabase {
    private List<Employee> employees;

    public GymDatabase() {
        employees = new ArrayList<>();
    }

    public void addEmployeeToList(Employee employee){
        employees.add(employee);
    }

    public void removeEmployeeFromList(Employee employee){
        employees.remove(employee);
    }

    public int getEmployeeListSize(){
        return employees.size();
    }

    private void printEmployeesReport(){
        System.out.println("################ Funcionários ###############");
        for (Employee employee : employees) {
            System.out.println(employee + " | Tipo: " + employee.getClass().getSimpleName());
        }
        System.out.println("#############################################\n");
    }

    private void printPersonalTrainersReport(){
        System.out.println("################ Professores ################");
        for (Employee employee : employees) {
            if(employee instanceof PersonalTrainer){
                System.out.println("Professor [" + employee.getName() + "]");
                System.out.println(((PersonalTrainer) employee).getCustomersWorkoutList());
            }
        }
        System.out.println("#############################################\n");
    }

    private void printReceptionistsReport(){
        System.out.println("############## Recepcionistas ###############");
        for (Employee employee : employees) {
            if(employee instanceof Receptionist){
                System.out.println("Nome: " + employee.getName() + ((Receptionist) employee).getWorkload());
            }
        }
        System.out.println("#############################################\n");
    }

    private void printCustomersReport(){
        System.out.println("################## Alunos ###################");
        for (Employee employee : employees) {
            if(employee instanceof PersonalTrainer){
                System.out.println(((PersonalTrainer) employee).getCustomersList());
            }
        }
        System.out.println("#############################################\n");
    }

    public void printReport(){
        printEmployeesReport();
        printPersonalTrainersReport();
        printReceptionistsReport();
        printCustomersReport();
    }
}
