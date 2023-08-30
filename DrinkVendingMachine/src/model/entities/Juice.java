package model.entities;

import model.entities.enums.flavors.JuiceFlavor;

public class Juice extends Drink {
    private JuiceFlavor juiceFlavor;

    public Juice(Integer id, Double price, JuiceFlavor juiceFlavor) {
        super(id, price);
        this.juiceFlavor = juiceFlavor;
    }

    @Override
    public String toString() {
        return juiceFlavor.name().charAt(0) + juiceFlavor.name().substring(1).toLowerCase() + " " + getClass().getSimpleName();
    }
}
