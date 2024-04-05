package edu.miu.cs489.model;

import java.util.List;

public class Contact implements Comparable<Contact>{
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<Phone> phones;
    private List<Email> emails;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public Contact(String firstName, String lastName, String company, String jobTitle, List<Phone> phones, List<Email> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phones = phones;
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return
                "\"firstName\":" + firstName + '\'' +
                ", \"lastName\":" + lastName + '\'' +
                ", \"company\":" + company + '\'' +
                ", \"jobTitle\":" + jobTitle + '\'' +
                ", \"phone\":" + phones +
                ", \"email\":" + emails;

    }

    @Override
    public int compareTo(Contact o) {
        return this.lastName.compareTo(o.lastName);
    }
}
