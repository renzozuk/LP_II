package br.ufrn.imd.application;

import br.ufrn.imd.model.entities.Car;
import br.ufrn.imd.model.entities.Motorcycle;
import br.ufrn.imd.model.dao.Repository;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Repository repository = new Repository();

        repository.addVehicleToRepository(new Car(false, "BYD", "ZRP-8402", 625.5, 1500, 4, 1650));

        repository.addVehicleToRepository(new Car(true, "Ford", "AAA-8888", 577.5, 21000, 4, 1600));

        repository.addVehicleToRepository(new Motorcycle(false, "Honda", "BBB-2019", 55.25, 3500, 850, "Electric"));

        repository.addVehicleToRepository(new Car(true, "Fiat", "ABB-1000", 225.0, 15000, 4, 1000));

        repository.addVehicleToRepository(new Motorcycle(true, "Yamaha", "XYZ-2019", 110.5, 4500, 250, "Electric"));

        repository.addVehicleToRepository(new Car(false, "Fiat", "ABC-5501", 75.0, 14000, 2, 1200));

        System.out.println(repository);
    }
}
