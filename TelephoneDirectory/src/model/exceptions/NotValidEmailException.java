package model.exceptions;

public class NotValidEmailException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public NotValidEmailException(){
        super("A valid email must have an @.");
    }

}
