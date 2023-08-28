package application;

import model.entities.Person;
import model.entities.TelephoneDirectory;
import model.entities.PhoneNumber;

public class Program {
    public static void main(String[] args) {
        Person maria = new Person("Maria", "maria@gmail.com");

        TelephoneDirectory first = new TelephoneDirectory("Escuro");
        first.addToList(new PhoneNumber("+55(35)91234-5678"), new Person("José", "jose@outlook.com"));
        first.addToList(new PhoneNumber("+55(54)98765-4321"), maria);
        first.addToList(new PhoneNumber("+55(69)91111-1111"), new Person("Brigitte", "brigitte@gmail.com"));
        first.addToList(new PhoneNumber("+1(809)123-4567"), maria);
        System.out.print(first);
        System.out.println();

        TelephoneDirectory second = new TelephoneDirectory("Stopstar");
        second.addToList(new PhoneNumber("+54(11)1234-5678"), new Person("Peter", "peter@gmail.com"));
        second.addToList(new PhoneNumber("+54(223)555-6789"), new Person("Yato", "yato@gmail.com"));
        second.addToList(new PhoneNumber("+598(2204)5199"), maria);
        System.out.print(second);
    }
}
