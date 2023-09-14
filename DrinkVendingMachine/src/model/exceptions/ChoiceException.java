package model.exceptions;

import java.io.Serial;

public class ChoiceException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ChoiceException(String msg) {
        super(msg);
    }
}
