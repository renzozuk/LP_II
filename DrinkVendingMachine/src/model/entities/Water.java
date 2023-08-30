package model.entities;

public class Water extends Drink {
    public Water(Integer id, Double price) {
        super(id, price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
