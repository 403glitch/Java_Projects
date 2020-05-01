package com.company;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions = new ArrayList<>();
    private String name;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions.add(transaction);
        System.out.println("The customer with name: "+name+" with transaction: "+transaction.doubleValue()+ " was created.");

    }

    public String getName() {

        return name;
    }
    public void addTransaction(Double transaction){

        this.transactions.add(transaction);
        System.out.println(transaction + " added in " + getName() + "'s" + " Account");
    }

    public ArrayList<Double> getTransactions() {

        return transactions;
    }
}

