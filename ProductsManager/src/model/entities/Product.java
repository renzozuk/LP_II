package model.entities;

import model.exceptions.NotValidPriceException;

public class Product {
    String name;
    double price;
    String brand;
    String description;

    public Product(String name, double price, String brand, String description) {
        if(price < 0){
            throw new NotValidPriceException(name, price);
        }
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " (" + brand + ") - $" + String.format("%,.2f", price) + " - \"" + description + "\"";

    }
}
