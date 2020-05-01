//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] out = readInteger(5);

        for(int i=0;i<out.length;i++){
            System.out.println("Input = " + out[i]);
        }
        System.out.println("Min value = " + finMin(out));

    }

    public static int[] readInteger (int count){
        System.out.println("Enter " + count + " integers :");
        Scanner sc = new Scanner(System.in);
        int[] input = new int[count];
        for (int i =0;i<input.length;i++){
            input[i] = sc.nextInt();
        }
        return  input;
    }

    public static int finMin (int[] array) {
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                min = array[i];
            } else {
                min = array[i + 1];
            }
        }
            return min;
    }
}
