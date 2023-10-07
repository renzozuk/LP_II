package model.entities;

import model.services.DDIService;
import model.services.ValidateNumber;

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
        ValidateNumber.validate(fullPhoneNumber);
        phoneList.put(fullPhoneNumber, person);
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("Operator: " + operator + "\n");
        for (PhoneNumber phoneNumber : phoneList.keySet()) {
            result.append("========================================").append("\n")
                .append(phoneList.get(phoneNumber)).append("Phone number: ").append(phoneNumber).append("\n")
                .append("Country: ").append(DDIService.getCountryByDDI(phoneNumber)).append("\n");
        }
        return result.toString();
    }
}
