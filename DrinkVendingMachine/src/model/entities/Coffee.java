package model.entities;

import model.entities.enums.flavors.CoffeeFlavor;

public class Coffee extends Drink {
    private CoffeeFlavor coffeeFlavor;
    private boolean cold;

    public Coffee(Integer id, Double price) {
        super(id, price);
        coffeeFlavor = CoffeeFlavor.BLACK;
        cold = false;
    }

    public Coffee(Integer id, Double price, CoffeeFlavor coffeeFlavor) {
        super(id, price);
        this.coffeeFlavor = coffeeFlavor;
        cold = false;
    }

    public Coffee(Integer id, Double price, CoffeeFlavor coffeeFlavor, boolean cold) {
        super(id, price);
        this.coffeeFlavor = coffeeFlavor;
        this.cold = cold;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if(cold){
            result.append("Iced ");
        }else{
            result.append("Hot ");
        }
        if(coffeeFlavor == CoffeeFlavor.BLACK){
            result.append(getClass().getSimpleName());
        }else{
            result.append(coffeeFlavor.name().charAt(0)).append(coffeeFlavor.name().substring(1).toLowerCase());
        }
        return result.toString();
    }
}
