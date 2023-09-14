package model.exceptions;

import java.io.Serial;

public class InvalidEmailException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public InvalidEmailException(){
        super("A valid email must have an @.");
    }

}
