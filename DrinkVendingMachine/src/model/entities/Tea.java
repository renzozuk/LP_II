package model.entities;

import model.entities.enums.flavors.TeaFlavor;

public class Tea extends Drink {
    private TeaFlavor teaFlavor;
    private boolean cold;

    public Tea(Integer id, Double price, TeaFlavor teaFlavor) {
        super(id, price);
        this.teaFlavor = teaFlavor;
        cold = false;
    }

    public Tea(Integer id, Double price, TeaFlavor teaFlavor, boolean cold) {
        super(id, price);
        this.teaFlavor = teaFlavor;
        this.cold = cold;
    }

    public TeaFlavor getTeaFlavor() {
        return teaFlavor;
    }

    @Override
    public String toString() {
        String result = "";
        if(cold){
            result += "Iced ";
        }else{
            result += "Hot ";
        }
        result += getTeaFlavor().name().charAt(0);
        result += getTeaFlavor().name().substring(1).toLowerCase() + " ";
        result += getClass().getSimpleName();
        return result;
    }
}

