package com.company;

public class VipCustomer {

        private String name;
        private double creditLimit;
        private String emailAddress;

    public VipCustomer(String name, double creditLimit , String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer (String name , double creditLimit){
        this(name, creditLimit , "abc@xyz");
    }

    public VipCustomer(){
        this("Default" , 1000.00 , "default@mno");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
