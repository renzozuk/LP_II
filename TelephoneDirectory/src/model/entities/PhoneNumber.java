package model.entities;

public class PhoneNumber {
    private String DDI;
    private String areaCode;
    private String number;

    public PhoneNumber(String fullNumber){
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

    public String toString(){
        return "+" + DDI + "(" + areaCode + ")" + number;
    }
}
