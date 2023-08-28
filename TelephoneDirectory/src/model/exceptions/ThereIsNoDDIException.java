package model.exceptions;

public class ThereIsNoDDIException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ThereIsNoDDIException(){
        super("There is no valid DDI.");
    }

    public ThereIsNoDDIException(String DDI){
        super("The DDI " + DDI + " is not valid.");
    }
}
