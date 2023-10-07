package br.ufrn.imd.model.entities;

public class Vehicle {
    private boolean rented;
    private String brand;
    private String licensePlate;
    private double rentValue;
    private int mileage;

    public Vehicle(boolean rented, String brand, String licensePlate, double rentValue, int mileage) {
        this.rented = rented;
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.rentValue = rentValue;
        this.mileage = mileage;
    }

    public boolean isRented() {
        return rented;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getRentValue() {
        return rentValue;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString(){
        return "Brand: " + brand + " | License plate: " + licensePlate + " | Rent value: " + String.format("%.2f", rentValue) + " | Mileage: " + mileage;
    }
}
