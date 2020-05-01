package com.company;

public class Contacts {

    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts newContact(String name, String phoneNumber){  //create newContact() method to record new contact details
       return new Contacts(name , phoneNumber);
    } // To return the name and phoneNumber saved in the newContact Records
    //To return we create a new instance of our Contacts class and then return the parameters of method newContact()
}
