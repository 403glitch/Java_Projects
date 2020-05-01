package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer cus = new Customer(500,"XYZ"); // first we set the value for our customer class fields by creating new instance

        Customer another = cus; // then we create a new variable of type Customer and assign the previous variable as its value
        another.setBalance(700); // then we use setBalance() to method to set the balance of our 2nd variable

        System.out.println("Name :" + cus.getName() + ", Balance :" + cus.getBalance());  // now when we print our output we will get the second updated balance[700]

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i<intList.size();i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2); // Adding element 2 at position 1

        for(int i = 0; i<intList.size();i++) {
            System.out.println(i + ": " + intList.get(i) );
        }
    }
}
