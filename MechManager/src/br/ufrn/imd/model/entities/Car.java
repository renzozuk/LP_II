package br.ufrn.imd.model.entities;

public class Car extends Vehicle {
    private int doors;
    private int power;

    public Car(boolean rented, String brand, String licensePlate, double rentValue, int mileage, int doors, int power) {
        super(rented, brand, licensePlate, rentValue, mileage);
        this.doors = doors;
        this.power = power;
    }

    public int getDoors() {
        return doors;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString(){
        return super.toString() + " | Doors: " + doors + " | Power: " + power;
    }
}
