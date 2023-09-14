package model.entities;

public class DurableProduct extends Product {
    int durability;

    public DurableProduct(String name, double price, String brand, String description, int durability) {
        super(name, price, brand, description);
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", durability: " + durability + " years";
    }
}
