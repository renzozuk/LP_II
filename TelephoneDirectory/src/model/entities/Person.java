package model.entities;

import model.exceptions.NotValidEmailException;

public class Person {
    private String name;
    private String email;

    public Person(String name, String email){
        if(!email.contains("@")){
            throw new NotValidEmailException();
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
