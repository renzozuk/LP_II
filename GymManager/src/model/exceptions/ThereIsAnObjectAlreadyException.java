package model.exceptions;

import java.io.Serial;

public class ThereIsAnObjectAlreadyException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ThereIsAnObjectAlreadyException(String objectName, String listName){
        super(objectName + " is already in " + listName + ".");
    }
}
