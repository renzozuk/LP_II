package br.ufrn.imd.model.entities;

public class Motorcycle extends Vehicle {
    private int engineDisplacement;
    private String ignition;

    public Motorcycle(boolean rented, String brand, String licensePlate, double rentValue, int mileage, int engineDisplacement, String ignition) {
        super(rented, brand, licensePlate, rentValue, mileage);
        this.engineDisplacement = engineDisplacement;
        this.ignition = ignition;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getIgnition() {
        return ignition;
    }

    public String toString(){
        return super.toString() + " | Engine displacement: " + engineDisplacement + " | Ignition: " + ignition;
    }
}
