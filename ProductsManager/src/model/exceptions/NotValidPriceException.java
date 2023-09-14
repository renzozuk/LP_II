package model.exceptions;

import java.io.Serial;

public class NotValidPriceException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public NotValidPriceException(){
        super("The price of the product cannot be negative.");
    }

    public NotValidPriceException(String name, double price){
        super("The price $" + price + " is not valid for the product " + name + ". Note that the price cannot be negative.");
    }
}
