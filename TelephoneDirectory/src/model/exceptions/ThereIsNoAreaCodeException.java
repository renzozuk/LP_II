package model.exceptions;

public class ThereIsNoAreaCodeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ThereIsNoAreaCodeException(){
        super("There is no valid area code.");
    }

    public ThereIsNoAreaCodeException(Integer areaCode){
        super("The area code " + areaCode + " is not valid.");
    }

    public ThereIsNoAreaCodeException(String areaCode){
        super("The area code " + areaCode + " is not valid.");
    }

    public ThereIsNoAreaCodeException(Integer areaCode, String country){
        super("The area code " + areaCode + " is not valid in " + country + ".");
    }

    public ThereIsNoAreaCodeException(String areaCode, String country){
        super("The area code " + areaCode + " is not valid in " + country + ".");
    }
}
