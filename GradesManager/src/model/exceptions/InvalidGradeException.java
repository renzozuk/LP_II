package model.exceptions;

import java.io.Serial;

public class InvalidGradeException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public InvalidGradeException(){
        super("A grade cannot be lower than 0.");
    }
}
