package application;

import model.entities.Person;
import model.entities.TelephoneDirectory;
import model.entities.PhoneNumber;

public class Program {
    public static void main(String[] args) {
        Person maria = new Person("Maria Tavares", "maria.tavares@example.com");

        TelephoneDirectory first = new TelephoneDirectory("Escuro");
        first.addToList(new PhoneNumber("+55(35)91234-5678"), new Person("José da Silva", "jose.silva1234567@example.com"));
        first.addToList(new PhoneNumber("+55(54)98765-4321"), maria);
        first.addToList(new PhoneNumber("+55(69)91111-1111"), new Person("Brigitte", "brigitte@example.com"));
        first.addToList(new PhoneNumber("+1(809)123-4567"), maria);
        System.out.println(first);

        TelephoneDirectory second = new TelephoneDirectory("Stopstar");
        second.addToList(new PhoneNumber("+54(11)1234-5678"), new Person("Ana Rodriguez", "ana.rod@example.com"));
        second.addToList(new PhoneNumber("+54(223)555-6789"), new Person("Juan Gonzalez", "juan_gonzalez@example.com"));
        second.addToList(new PhoneNumber("+598(2)204-5199-990"), maria);
        System.out.println(second);

        TelephoneDirectory third = new TelephoneDirectory("Littleson");
        third.addToList(new PhoneNumber("+1(929)860-1510"), new Person("Peter", "peter@example.com"));
        System.out.println(third);
    }
}
