// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("BOI");
        bank.addNewBranch("Ashiana");
        bank.addNewBranch("Digha");
        bank.addCustomer("Ashiana", "Guddu",5000.00);
        bank.addCustomer("Ashiana","Lolli",400.50);
        bank.addCustomer("Digha","Ankan",9.5);

        bank.addNewBranch("Phulwari");
        bank.addCustomer("Phulwari","Nikki",50000.00);

        bank.addTransaction("Phulwari","Nikki",100000.00);
        bank.addTransaction("Digha","Ankan",10.00);

        bank.listOfCustomers("Ashiana");
        bank.listOfCustomers("Digha");
        bank.listOfCustomers("Phulwari");
    }
}

