package model.exceptions;

public class InvalidAreaCodeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidAreaCodeException(){
        super("There is no valid area code.");
    }

    public InvalidAreaCodeException(Integer areaCode){
        super("The area code " + areaCode + " is not valid.");
    }

    public InvalidAreaCodeException(String areaCode){
        super("The area code " + areaCode + " is not valid.");
    }

    public InvalidAreaCodeException(Integer areaCode, String country){
        super("The area code " + areaCode + " is not valid in " + country + ".");
    }

    public InvalidAreaCodeException(String areaCode, String country){
        super("The area code " + areaCode + " is not valid in " + country + ".");
    }
}
