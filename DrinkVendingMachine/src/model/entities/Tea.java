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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if(cold){
            result.append("Iced ");
        }else{
            result.append("Hot ");
        }
        result.append(teaFlavor.name().charAt(0)).append(teaFlavor.name().substring(1).toLowerCase()).append(" ").append(getClass().getSimpleName());
        return result.toString();
    }
}

