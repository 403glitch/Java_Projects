package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();  // we created an arrayList of Branches because a bank can have multiple branches

    public Bank(String name) {
        this.name = name;
    }

    public boolean addNewBranch(String name){
        int index = findBranch(name);
        if (index >= 0){
            System.out.println("The branch is already created!");
            return false;
        }else {
            this.branches.add(new Branch(name));  //to add a new name in the BRANCHES class we will create a new instance of the BRANCHES CLASS in add() method and then we will pass the name parameter
            System.out.println("The branch "+name+" was created!");
            return true;
        }



    }
    public boolean addCustomer(String branchName,String customerName, double transaction){
        int index = findBranch(branchName); //the variable index will return the position of the branchName [ int index :- is used for finding elements position in an arrayList ]
        if (index >= 0 ){
            this.branches.get(index).addNewCustomer(customerName,transaction); // First we call our this.branches field, then we call get() method to get the element at position passed to it index variable
            return true;                            // then we use add() method to add new customer and new transaction
        }else {
            System.out.println("the branch was not found!");
            return false;
        }
    }
    public boolean addTransaction (String branchName,String customerName,double transaction){
        int index = findBranch(branchName);
        if (index >= 0){
            this.branches.get(index).addNewTransaction(customerName,transaction);  // same thing is happening as addCustomer
            return true;
        }else {
            System.out.println("the branch was not found");
            return false;
        }
    }
    public void listOfCustomers (String branchName){
        int index = findBranch(branchName);   // index variable to save the position of the branchName element
        if (index >= 0){
            ArrayList<Customer> customersList = branches.get(index).getCustomers(); // Created a new ArrayList customerList and as it value we have passed branches.get(index) which will give us element using the position from index variable then we call getCustomer() method from Branch Class to get the customer name from that particular branch and save it in the customerList arrayList
            for (int i = 0 ; i < customersList.size() ; i++){  // then we loop the customerList arrayList
                System.out.println("Customer Name: "+customersList.get(i).getName()); // then we print the customerName w/ customerLIst.get(i) to get the element at position "i" and then we use getName() method to get the name of customer
                ArrayList<Double> transactionList = customersList.get(i).getTransactions();// Created a new ArrayList transactionList and as it value we have passed customerList.get(i) to get the customerName and then we have called the getTransaction() method from our Customer class to get the transaction value for that particular customer
                for (int j = 0 ; j < transactionList.size();j++){ // then we loop our transactionLIst array to get th element and convert it to double primitive dataType
                    System.out.println("      "+ transactionList.get(j));
                }
            }
        }else {
            System.out.println("the branch was not found!");
        }
    }
    private int findBranch (String name){
        for (int i = 0 ; i < branches.size() ; i++){
            if (branches.get(i).getName() == name){
                return i;
            }
        }
        return -1;
    }
}
