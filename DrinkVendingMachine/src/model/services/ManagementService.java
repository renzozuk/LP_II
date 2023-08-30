package model.services;

import model.entities.Coffee;
import model.entities.Drink;
import model.entities.Juice;
import model.entities.Soda;
import model.entities.Tea;
import model.entities.Water;
import model.entities.enums.flavors.CoffeeFlavor;
import model.entities.enums.flavors.JuiceFlavor;
import model.entities.enums.flavors.SodaFlavor;
import model.entities.enums.flavors.TeaFlavor;

import java.util.ArrayList;
import java.util.List;

public class ManagementService {
    private List<Drink> drinks;

    public ManagementService(){
        drinks = new ArrayList<>();
    }

    protected Drink chooseADrink(int id){
        return drinks.stream().filter(drink -> drink.getId().equals(id)).findFirst().orElse(null);
    }

    public void addCoffeeToMachine(Double price){
        drinks.add(new Coffee(drinks.size() + 1, price));
    }

    public void addCoffeeToMachine(Double price, CoffeeFlavor coffeeFlavor){
        drinks.add(new Coffee(drinks.size() + 1, price, coffeeFlavor));
    }

    public void addCoffeeToMachine(Double price, CoffeeFlavor coffeeFlavor, boolean cold){
        drinks.add(new Coffee(drinks.size() + 1, price, coffeeFlavor, cold));
    }

    public void addJuiceToMachine(Double price, JuiceFlavor juiceFlavor){
        drinks.add(new Juice(drinks.size() + 1, price, juiceFlavor));
    }

    public void addSodaToMachine(Double price, SodaFlavor sodaFlavor){
        drinks.add(new Soda(drinks.size() + 1, price, sodaFlavor));
    }

    public void addTeaToMachine(Double price, TeaFlavor teaFlavor){
        drinks.add(new Tea(drinks.size() + 1, price, teaFlavor));
    }

    public void addTeaToMachine(Double price, TeaFlavor teaFlavor, boolean cold){
        drinks.add(new Tea(drinks.size() + 1, price, teaFlavor, cold));
    }

    public void addWaterToMachine(Double price){
        drinks.add(new Water(drinks.size() + 1, price));
    }

    public int getQuantity(){
        return drinks.size();
    }

    protected String showProducts(){
        StringBuilder result = new StringBuilder("Hello :) your options are:\n");
        for (Drink drink : drinks) {
            result.append("[").append(drink.getId()).append("] ").append(drink).append(" - $").append(String.format("%.2f%n", drink.getPrice()));
        }
        return result.toString();
    }
}
