package edu.miu.cs489;

import edu.miu.cs489.model.Contact;
import edu.miu.cs489.model.Email;
import edu.miu.cs489.model.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContractTrackingApplication {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[] {
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                        Arrays.asList(new Phone("240-133-0011", "Home"), new Phone("240-112-0123", "Mobile")),
                        Arrays.asList(new Email("dave.sang@gmail.com", "Home"), new Email("dsanger@argos.com", "Work"))),
                new Contact("Carlos", "Jimenez", "Zappos", "Director"),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                        Arrays.asList(new Phone("412-116-9988", "Work")),
                        Arrays.asList(new Email("ali@bmi.com", "Work")))
        };

        printAsJSON(contacts);
    }

    public static void printAsJSON (Contact[] contacts) {
        Arrays.sort(contacts);
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");

        for(int i = 0; i < contacts.length; i++) {
            if(i != contacts.length-1) {
                sb.append("\t{ ").append(contacts[i].toString()).append(" },\n");
            } else {
                sb.append("\t{ ").append(contacts[i].toString()).append(" }\n");
            }
        }

        sb.append("]");
        System.out.println(sb.toString());
    }
}
