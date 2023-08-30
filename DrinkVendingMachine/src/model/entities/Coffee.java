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

    public CoffeeFlavor getCoffeeFlavor() {
        return coffeeFlavor;
    }

    @Override
    public String toString() {
        String result = "";
        if(cold){
            result += "Iced ";
        }else{
            result += "Hot ";
        }
        if(getCoffeeFlavor() == CoffeeFlavor.BLACK){
            result += getClass().getSimpleName();
        }else{
            result += getCoffeeFlavor().name().charAt(0);
            result += getCoffeeFlavor().name().substring(1).toLowerCase();
        }
        return result;
    }
}
