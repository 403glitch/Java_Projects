package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public BankAccount(){  //fixed value constructor
        this(987 , 555, "xyz" ,"bushid@jj" , 987);
        System.out.println("Secondary Constructor");
    }

    public BankAccount (int accountNumber1, double balance, String customerName, String emailAddress, int phoneNumber){
        System.out.println("Main constructor");
        this.accountNumber = accountNumber1;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount (String customerName, String emailAddress , int phoneNumber){ //accountnumber1 and balance are fixed
        this(9999, 500 , customerName,emailAddress,phoneNumber);// here we have set a default value for accountNumber1 & balance, the values can be changed
        System.out.println("Tertiary Constructor");
    }


    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposited Amount = " + deposit + " Updated Balance = " + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if(this.balance - withdraw > 0) {
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed, Remaining balance = " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }
}
