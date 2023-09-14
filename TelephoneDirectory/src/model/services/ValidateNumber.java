package model.services;

import model.entities.PhoneNumber;
import model.exceptions.InvalidNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private static void validateNorthAmericanNumber(PhoneNumber phoneNumber) {
        StringBuilder numberToValidate = new StringBuilder("(");
        numberToValidate.append(phoneNumber.getAreaCode()).append(")").append(phoneNumber.getNumber());

        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(numberToValidate.toString());

        if (!matcher.matches()) {
            switch (phoneNumber.getAreaCode()) {
                case "242" -> throw new InvalidNumberException(numberToValidate.toString(), "+1(XXX)YYY-YYYY", "Bahamas");
                case "246" -> throw new InvalidNumberException(numberToValidate.toString(), "+1(XXX)YYY-YYYY", "Barbados");
                case "809", "829", "849" -> throw new InvalidNumberException(numberToValidate.toString(), "+1(XXX)YYY-YYYY", "Dominican Republic");
                case "876" -> throw new InvalidNumberException(numberToValidate.toString(), "+1(XXX)YYY-YYYY", "Jamaica");
                default -> throw new InvalidNumberException(numberToValidate.toString(), "+1(XXX)YYY-YYYY", "the United States or Canada");
            }
        }
    }

    private static void validateArgentinianNumber(PhoneNumber phoneNumber) {
        StringBuilder numberToValidate = new StringBuilder("(");
        numberToValidate.append(phoneNumber.getAreaCode()).append(")").append(phoneNumber.getNumber());

        Pattern pattern = Pattern.compile("\\(1{2}\\)\\d{4}-?\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}|\\(\\d{4}\\)\\d{2}-?\\d{4}");
        Matcher matcher = pattern.matcher(numberToValidate.toString());

        if (!matcher.matches()) {
            throw new InvalidNumberException(numberToValidate.toString(), "+54(11)YYYY-YYYY, +54(XXX)YYY-YYYY or +54(XXXX)YY-YYYY", "Argentina");
        }
    }

    private static void validateBrazilianNumber(PhoneNumber phoneNumber) {
        StringBuilder numberToValidate = new StringBuilder("(");
        numberToValidate.append(phoneNumber.getAreaCode()).append(")").append(phoneNumber.getNumber());

        Pattern pattern = Pattern.compile("\\(\\d{2}\\)9\\d{4}-?\\d{4}|\\(\\d{2}\\)[2-5]\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(numberToValidate.toString());

        if (!matcher.matches()) {
            throw new InvalidNumberException(numberToValidate.toString(), "+55(XX)9YYYY-YYYY or +55(XX)YYYY-YYYY", "Brazil");
        }
    }

    private static void validateFrenchNumber(PhoneNumber phoneNumber) {
        StringBuilder numberToValidate = new StringBuilder("(");
        numberToValidate.append(phoneNumber.getAreaCode()).append(")").append(phoneNumber.getNumber());

        Pattern pattern = Pattern.compile("\\(0?[1-9]\\)\\d{2}-? ?\\d{2}-? ?\\d{2}-? ?\\d{2}");
        Matcher matcher = pattern.matcher(numberToValidate.toString());

        if (!matcher.matches()) {
            throw new InvalidNumberException(numberToValidate.toString(), "+33(XX)YY-YY-YY-YY", "France");
        }
    }

    private static void validateJapaneseNumber(PhoneNumber phoneNumber) {
        StringBuilder numberToValidate = new StringBuilder("(");
        numberToValidate.append(phoneNumber.getAreaCode()).append(")").append(phoneNumber.getNumber());

        Pattern pattern = Pattern.compile("\\(\\d{2}\\)\\d{4}-?\\d{4}|\\(0\\d{2}\\)\\d{4}-?\\d{4}");
        Matcher matcher = pattern.matcher(numberToValidate.toString());

        if (!matcher.matches()) {
            throw new InvalidNumberException(numberToValidate.toString(), "+81(XX)YYYY-YYYY or +81(0XX)YYYY-YYYY", "Japan");
        }
    }

    private static void validateUruguayanNumber(PhoneNumber phoneNumber) {
        StringBuilder numberToValidate = new StringBuilder();
        if(phoneNumber.getAreaCode().length() == 0){
            numberToValidate.append(phoneNumber.getNumber());
        }else{
            numberToValidate.append("(").append(phoneNumber.getAreaCode()).append(")").append(phoneNumber.getNumber());
        }

        Pattern pattern = Pattern.compile("\\([2|4]\\d{3}\\)\\d{2} ?\\d{2}|\\(?9\\d{3}\\)? ?\\d{2} ?\\d{2}");
        Matcher matcher = pattern.matcher(numberToValidate.toString());

        if (!matcher.matches()) {
            throw new InvalidNumberException(numberToValidate.toString(), "+598(2XXX)YYYY, +598(2XXX)YY YY, +598(4XXX)YYYY, +598(4XXX)YY YY, +598(9XXX)YYYY, +598(9XXX)YY YY, +598()9YYYYYYY, +598()9YYY YYYY or +598()9YYY YYYY", "Uruguay");
        }
    }
    
    public static void validate(PhoneNumber phoneNumber) {
        if (!phoneNumber.getNumber().contains("0") && !phoneNumber.getNumber().contains("1") && !phoneNumber.getNumber().contains("2") && !phoneNumber.getNumber().contains("3") && !phoneNumber.getNumber().contains("4") && !phoneNumber.getNumber().contains("5") && !phoneNumber.getNumber().contains("6") && !phoneNumber.getNumber().contains("7") && !phoneNumber.getNumber().contains("8") && !phoneNumber.getNumber().contains("9")) {
            throw new InvalidNumberException(phoneNumber.getNumber());
        }
        switch (phoneNumber.getDDI()) {
            case "1" -> validateNorthAmericanNumber(phoneNumber);
            case "33" -> validateFrenchNumber(phoneNumber);
            case "54" -> validateArgentinianNumber(phoneNumber);
            case "55" -> validateBrazilianNumber(phoneNumber);
            case "598" -> validateUruguayanNumber(phoneNumber);
            case "81" -> validateJapaneseNumber(phoneNumber);
        }
    }
}
