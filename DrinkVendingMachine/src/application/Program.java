package application;

import model.entities.enums.flavors.CoffeeFlavor;
import model.entities.enums.flavors.JuiceFlavor;
import model.entities.enums.flavors.SodaFlavor;
import model.entities.enums.flavors.TeaFlavor;
import model.services.ManagementService;
import model.services.SellingService;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ManagementService managementService = new ManagementService();
        managementService.addWaterToMachine(0.99);
        managementService.addCoffeeToMachine(2.99);
        managementService.addSodaToMachine(6.99, SodaFlavor.GUARANA);
        managementService.addCoffeeToMachine(19.99, CoffeeFlavor.MACCHIATO);
        managementService.addSodaToMachine(7.99, SodaFlavor.COLA);
        managementService.addJuiceToMachine(8.99, JuiceFlavor.LEMON);
        managementService.addCoffeeToMachine(2.99, CoffeeFlavor.BLACK, true);
        managementService.addTeaToMachine(5.99, TeaFlavor.BLACK, true);
        managementService.addCoffeeToMachine(14.99, CoffeeFlavor.CAPPUCCINO);
        managementService.addTeaToMachine(4.49, TeaFlavor.GREEN);

        SellingService sellingService = new SellingService(managementService);
        System.out.println(sellingService);

        sellingService.customerService();
    }
}
