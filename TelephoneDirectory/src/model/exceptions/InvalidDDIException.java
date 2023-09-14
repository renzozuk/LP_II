package model.exceptions;

import java.io.Serial;

public class InvalidDDIException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public InvalidDDIException(){
        super("There is no valid DDI.");
    }

    public InvalidDDIException(String DDI){
        super("The DDI " + DDI + " is not valid.");
    }
}
