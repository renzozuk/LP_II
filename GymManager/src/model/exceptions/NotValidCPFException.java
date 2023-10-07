package model.exceptions;

import java.io.Serial;

public class NotValidCPFException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public NotValidCPFException(String cpf){
        super("The CPF " + cpf + " is not valid. Note that a valid CPF must have the format XXX.XXX.XXX-XX or XXXXXXXXXXX.");
    }
}
