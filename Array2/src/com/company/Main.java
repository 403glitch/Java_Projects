package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(9);

        for(int i=0;i<myIntegers.length;i++){
            System.out.println("Elements " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("Average = " + getAverage(myIntegers));
    }

    public static int[] getIntegers (int numbers){
        System.out.println("Enter " + numbers + " integer values \r");
        int[] values = new int[numbers];

        for(int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage (int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }

        return (double)sum / (double)array.length;
    }
}
