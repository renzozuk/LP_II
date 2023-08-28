package model.exceptions;

public class InvalidGradeException extends RuntimeException{
    public InvalidGradeException(){
        super("A grade cannot be lower than 0.");
    }
}
