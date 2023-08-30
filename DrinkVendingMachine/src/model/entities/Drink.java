package model.entities;

public class Drink {
    private Integer id;
    private Double price;

    public Drink(Integer id, Double price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }


}
