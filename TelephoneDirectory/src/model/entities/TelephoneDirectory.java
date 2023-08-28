package model.entities;

import model.services.AreaCode;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private String operator;
    private Map<PhoneNumber, Person> phoneList;

    public TelephoneDirectory(String operator){
        this.operator = operator;
        phoneList = new HashMap<>();
    }

    public void addToList(PhoneNumber fullPhoneNumber, Person person){
        phoneList.put(fullPhoneNumber, person);
    }

    @Override
    public String toString(){
        String result = "Operator: " + operator + "\n";
        for (PhoneNumber phoneNumber : phoneList.keySet()) {
            result += "========================================" + "\n";
            result += phoneList.get(phoneNumber);
            result += "Phone number: " +  phoneNumber + "\n";
            result += "Country: " + AreaCode.getCountryByDDI(phoneNumber) + "\n";
        }
        return result;
    }
}
