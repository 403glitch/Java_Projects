package com.company;

public class Main {

    public static void main(String[] args) {
        for (double i=0; i<5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        for (int i=2;i<9;i++){
            System.out.println("Interest rate (Increment) = " + calcInterest(10000,i));
        }

        System.out.println("****************************************************************");

        for (int i=8;i>1;i--){
            System.out.println("Interest rate (Decrement) = " + calcInterest(10000,i));
        }

        System.out.println("*************************************************************************************");

        int number;       // Simple example of for-loop EX - 1
        for (number = 1; number < 7; number += 2 ) {
            System.out.println(number);
        }

        int Number = 1;       // Different way of doing what we did in EX - 1
        for (int i = 1; i < 7; i += 2 ) { //Here our Variable Number will remain unused
            System.out.println(i); //Instead of Number we created i and assigned it Data type & value similar to Number
        }                          // And used i in our processing

    }


    public static double calcInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}