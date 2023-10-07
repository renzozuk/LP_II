package model.entities.people;

import model.exceptions.ThereIsAnObjectAlreadyException;

import java.util.ArrayList;
import java.util.List;

public class PersonalTrainer extends Employee {
    private List<Customer> customers;

    public PersonalTrainer(String name, int id) {
        super(name, id);
        customers = new ArrayList<>();
    }

    public void addCustomerToList(Customer customer){
        for (Customer c : customers) {
            if(c.equals(customer)){
                throw new ThereIsAnObjectAlreadyException(customer.getName(), "customers list");
            }
        }

        customers.add(customer);
    }

    public void removeCustomerFromList(Customer customer){
        customers.remove(customer);
    }

    public String getCustomersList(){
        StringBuilder result = new StringBuilder();

        for (Customer customer : customers) {
            result.append(customer);
        }

        return result.toString();
    }

    public String getCustomersWorkoutList(){
        StringBuilder result = new StringBuilder();

        for (Customer customer : customers) {
            result.append(customer.getWorkoutList());
        }

        return result.toString();
    }
}
