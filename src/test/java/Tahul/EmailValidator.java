package Tahul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        
        String[] emails = {
            "john.doe@example.com",
            "jane_doe123@gmail.com",
            "invalid_email",
            "user@example.c",
            "user@.com",
            "user123@domain.net",
            "test@sub.domain.org",
            "wrong@domain..com"
        };

       
        Pattern pattern = Pattern.compile(regex);

       
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
