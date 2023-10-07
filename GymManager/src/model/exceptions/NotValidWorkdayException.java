package model.exceptions;

import java.io.Serial;

public class NotValidWorkdayException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public NotValidWorkdayException(){
        super("Sunday is not a valid workday.");
    }

    public NotValidWorkdayException(String day){
        super(day + " is not a valid workday.");
    }
}
