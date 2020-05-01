//Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message gEnter number:h
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//        Hint:
//        -Use an endless while loop.
//
//        Bonus:
//        -Create a project with the name MinAndMaxInputChallenge.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner1 = new Scanner(System.in);
            int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;


	        while (true){

                System.out.println("Enter number ");
                boolean isAnInt = scanner1.hasNextInt();
                if (isAnInt){
                int num = scanner1.nextInt();
                        if (num > max){
                            max = num;
                        }

                        if (num < min){
                            min = num;
                        }
                } else {
                    break;
                }

                scanner1.nextLine();
            }
	        System.out.println("Max = " + max + " Min = " + min);
            scanner1.close();
    }
}
