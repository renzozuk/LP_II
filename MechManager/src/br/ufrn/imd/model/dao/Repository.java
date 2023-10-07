package br.ufrn.imd.model.dao;

import br.ufrn.imd.model.entities.Car;
import br.ufrn.imd.model.entities.Motorcycle;
import br.ufrn.imd.model.entities.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {
    private List<Vehicle> vehicles;

    public Repository() {
        vehicles = new ArrayList<>();
    }

    public void addVehicleToRepository(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    private String showVehicles(){
        Map<String, Integer> brands = calculateBiggest();

        int biggest = vehicles.stream().filter(v -> v instanceof Car).map(v -> brands.get(v.getBrand())).mapToInt(v -> v).filter(v -> v >= 0).max().orElse(0);

        String mostCommonBrand = brands.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(biggest))
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);

        StringBuilder result = new StringBuilder("Vehicles list:\n");

        for (Vehicle vehicle : vehicles) {
            result.append("Type: ").append(vehicle.getClass().getSimpleName()).append(" | ").append(vehicle).append("\n");
        }

        result.append("\nBrand that have more cars: ").append(mostCommonBrand);

        return result.toString();
    }

    private Map<String, Integer> calculateBiggest(){
        Map<String, Integer> brands = new HashMap<>();

        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Car){
                brands.put(vehicle.getBrand(), brands.getOrDefault(vehicle.getBrand(), 0) + 1);
            }
        }

        return brands;
    }

    private String showRentedVehicles(){
        StringBuilder result = new StringBuilder("===== Rented Vehicles =====\n");

        for (Vehicle vehicle : vehicles) {
            if(vehicle.isRented()){
                result.append("Type: ").append(vehicle.getClass().getSimpleName()).append(" | ").append(vehicle).append("\n");
            }
        }

        // Get the leasing total value of the rented vehicles
        result.append(String.format("%nLeasing total value: %.2f%n", vehicles.stream().filter(Vehicle::isRented).mapToDouble(Vehicle::getRentValue).sum()))
                .append("===== End =====");

        return result.toString();
    }

    private String showAvailableVehicles(){
        StringBuilder result = new StringBuilder("===== Available vehicles =====\n");

        for (Vehicle vehicle : vehicles) {
            if(!vehicle.isRented()){
                result.append(vehicle).append("\n");
            }
        }

        Vehicle mostExpensiveVehicle = vehicles.stream().filter(vehicle -> !vehicle.isRented()).max(Comparator.comparing(Vehicle::getRentValue)).orElse(null);

        assert mostExpensiveVehicle != null;
        result.append("\n").append("Most expensive vehicle: ").append(mostExpensiveVehicle.getLicensePlate()).append("\n").append("===== End =====");

        return result.toString();
    }

    private String manageMaintenance(){
        StringBuilder result = new StringBuilder("===== Maintenance =====\n");

        double litersOfOil = vehicles.stream().filter(v -> v instanceof Car && v.getMileage() % 7000 == 0).mapToDouble(v -> {
            result.append("Vehicle: ").append(v.getBrand()).append(" has changed the oil.").append("\n");
            return 3.5;
        }).sum()
        + vehicles.stream().filter(v -> v instanceof Motorcycle && v.getMileage() % 3500 == 0).mapToDouble(v -> {
            result.append("Vehicle: ").append(v.getBrand()).append(" has changed the oil.").append("\n");
            return 1.5;
        }).sum();

        result.append(String.format("%nTotal quantity of oil changed: %.1f%n", litersOfOil)).append("===== End =====");

        return result.toString();
    }

    @Override
    public String toString(){
        return showVehicles() + "\n" + "\n"
                + showRentedVehicles() + "\n" + "\n"
                + showAvailableVehicles() + "\n" + "\n"
                + manageMaintenance();
    }
}
