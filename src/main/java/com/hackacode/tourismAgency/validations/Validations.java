package com.hackacode.tourismAgency.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
    public boolean IsEmail(String email){
        String regex = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}
