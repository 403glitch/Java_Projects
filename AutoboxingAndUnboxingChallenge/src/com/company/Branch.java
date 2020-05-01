package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();  // Setting default value for ArrayList<Customers>

    public Branch(String name) {
        this.name = name;
        // this.customer is not used because we have already set our default value
    }

    public boolean addNewCustomer(String name, Double transaction){ // we used boolean so that it can pass FALSE if the customer already exists and we cannot add another customer
        int index = findCustomer(name);
        if (index < 0){
            customers.add(new Customer(name,transaction));  // Customer is an ArrayList so we add elements into it by using add() method
            return true;
        }else{
            System.out.println("customer has already been created!");
            return false;
        }

//        if(findCustomer(name) == null){
//            this.customers.add(new Customer(name , transaction));
//            return true;
//        } else {
//            return false;
//        }

    }
    public boolean addNewTransaction(String customer,Double transaction){ // we used boolean so that it can pass FALSE if the transaction already exists and we cannot add another transaction
        int index = findCustomer(customer);
        if (index >= 0){
            this.customers.get(index).addTransaction(transaction);  // here first we call our this.customer field then we use get() method and pass index(variable)
            return true;                            // get method will return the element by using the position passed to it by index(variable),
        }else {                                     // then we call addTransaction() method from Customer Class to and pass transaction parameter, So that the method can add a transaction for thar customer name
            System.out.println("the customer was not found!");
            return false;
        }

    }
    private int findCustomer(String name){  // we pass parameters to this method to find customers
        for (int i = 0; i<customers.size(); i++){  // it will trough the complete arrayList to find the customerName passed to it for its parameter String name
            if (customers.get(i).getName() == name){
                return i;  // it will return "i" that is customerName it is in the ArrayList
            }
        }
        return -1;
    }

    public String getName() {  // to show branch name
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
