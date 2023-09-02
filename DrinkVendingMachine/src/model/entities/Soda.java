package model.entities;

import model.entities.enums.flavors.SodaFlavor;

public class Soda extends Drink {
    private SodaFlavor sodaFlavor;

    public Soda(Integer id, Double price, SodaFlavor sodaFlavor) {
        super(id, price);
        this.sodaFlavor = sodaFlavor;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(sodaFlavor.name().charAt(0) + sodaFlavor.name().substring(1).toLowerCase());
        if(sodaFlavor != SodaFlavor.COLA){
            result.append(" Soda");
        }
        return result.toString();
    }
}
