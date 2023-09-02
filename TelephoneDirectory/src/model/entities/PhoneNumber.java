package model.entities;

import model.exceptions.InvalidDDIException;

public class PhoneNumber {
    private String DDI;
    private String areaCode;
    private String number;

    public PhoneNumber(String fullNumber){
        if(fullNumber.charAt(0) != '+'){
            throw new InvalidDDIException();
        }
        String[] phoneNumber = fullNumber.substring(1).split("\\(|\\)");
        DDI = phoneNumber[0];
        areaCode = phoneNumber[1];
        number = phoneNumber[2];
    }

    public String getDDI() {
        return DDI;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("+" + DDI);
        if(areaCode.length() != 0){
            result.append("(").append(areaCode).append(")");
        }else{
            result.append(" ");
        }
        result.append(number);
        return result.toString();
    }
}
