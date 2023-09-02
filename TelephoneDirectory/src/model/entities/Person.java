package model.entities;

import model.exceptions.InvalidEmailException;

public class Person {
    private String name;
    private String email;

    public Person(String name, String email){
        if(!email.contains("@")){
            throw new InvalidEmailException();
        }
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n"
                + "Email: " + email + "\n";
    }
}
