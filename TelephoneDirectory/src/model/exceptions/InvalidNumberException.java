package model.exceptions;

import java.io.Serial;

public class InvalidNumberException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public InvalidNumberException(String invalidNumber){
        super(invalidNumber + " is not a valid number.");
    }

    public InvalidNumberException(String invalidNumber, String country){
        super(invalidNumber + " is not a valid number in " + country + ".");
    }

    public InvalidNumberException(String invalidNumber, String validNumber, String country){
        super(invalidNumber + " is not a valid number in " + country + ". Note that a valid number in " + country + " must have the format " + validNumber + ".");
    }
}
