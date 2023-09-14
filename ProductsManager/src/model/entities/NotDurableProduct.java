package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NotDurableProduct extends Product {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate expirationDate;
    String type;

    public NotDurableProduct(String name, double price, String brand, String description, String expirationDate, String type) {
        super(name, price, brand, description);
        this.expirationDate = LocalDate.parse(expirationDate, dtf);
        this.type = type;
    }

    public String getExpirationDate() {
        return expirationDate.format(dtf);
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = LocalDate.parse(expirationDate, dtf);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", expiration date: " + getExpirationDate() +
                ", type: " + type;
    }
}
