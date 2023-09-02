package model.exceptions;

public class InvalidEmailException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InvalidEmailException(){
        super("A valid email must have an @.");
    }

}
