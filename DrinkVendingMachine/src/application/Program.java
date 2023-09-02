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
        managementService.addSodaToMachine(7.99, SodaFlavor.COLA);
        managementService.addSodaToMachine(6.99, SodaFlavor.GUARANA);
        managementService.addJuiceToMachine(6.99, JuiceFlavor.LEMON);
        managementService.addJuiceToMachine(6.99, JuiceFlavor.ORANGE);
        managementService.addJuiceToMachine(9.99, JuiceFlavor.STRAWBERRY);
        managementService.addCoffeeToMachine(2.99);
        managementService.addCoffeeToMachine(2.99, CoffeeFlavor.BLACK, true);
        managementService.addCoffeeToMachine(19.99, CoffeeFlavor.MACCHIATO);
        managementService.addCoffeeToMachine(19.99, CoffeeFlavor.MACCHIATO, true);
        managementService.addCoffeeToMachine(13.99, CoffeeFlavor.CAPPUCCINO);
        managementService.addCoffeeToMachine(13.99, CoffeeFlavor.CAPPUCCINO, true);
        managementService.addTeaToMachine(4.49, TeaFlavor.GREEN);
        managementService.addTeaToMachine(5.99, TeaFlavor.BLACK);
        managementService.addTeaToMachine(5.99, TeaFlavor.BLACK, true);
        managementService.addTeaToMachine(5.99, TeaFlavor.MINT);
        managementService.addTeaToMachine(5.99, TeaFlavor.MINT, true);

        SellingService sellingService = new SellingService(managementService);
        System.out.println(sellingService);

        sellingService.customerService();
    }
}
