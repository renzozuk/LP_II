package application;

import model.entities.Person;
import model.entities.TelephoneDirectory;
import model.entities.PhoneNumber;

public class Program {
    public static void main(String[] args) {
        // Note that a phone number is in the following format +XX()YYYY when the area code is not necessary or doesn't exist.
        Person maria = new Person("Maria Tavares", "maria.tavares@example.com");

        TelephoneDirectory first = new TelephoneDirectory("Escuro");
        first.addToList(new PhoneNumber("+55(35)91234-5678"), new Person("José da Silva", "jose.silva1234567@example.com"));
        first.addToList(new PhoneNumber("+55(54)98765-4321"), maria);
        first.addToList(new PhoneNumber("+55(69)91111-1111"), new Person("Brigitte Oliveira", "brigitte.oliveira1@example.com"));
        first.addToList(new PhoneNumber("+1(809)123-4567"), maria);
        System.out.println(first);

        TelephoneDirectory second = new TelephoneDirectory("Stopstar");
        second.addToList(new PhoneNumber("+54(11)1234-5678"), new Person("Ana Rodriguez", "ana.rod@example.com"));
        second.addToList(new PhoneNumber("+54(223)555-6789"), new Person("Juan Gonzalez", "juan.gonzalez@example.com"));
        second.addToList(new PhoneNumber("+598()9522 11 46"), maria);
        second.addToList(new PhoneNumber("+598(2411)88 39"), new Person("Doris Castro", "doris.castro1@example.com"));
        //second.addToList(new PhoneNumber("+51()987-654-321"), new Person("Luis Quispe", "luis.quispe@example.com"));
        System.out.println(second);

        TelephoneDirectory third = new TelephoneDirectory("Littleson");
        third.addToList(new PhoneNumber("+1(929)860-1510"), new Person("Peter Parker", "peter.parker@example.com"));
        third.addToList(new PhoneNumber("+1(718)759-0409"), new Person("Tony Stark", "tony.stark@example.com"));
        third.addToList(new PhoneNumber("+33(06)87 65 43 21"), new Person("Dubois Martin", "dubois.martin@example.com"));
        third.addToList(new PhoneNumber("+81(80)4758-3897"), new Person("Kokiyu Kinjo", "kokiyu.kinjo@example.com"));
        System.out.println(third);
    }
}
