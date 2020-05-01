package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray = new int[10];   // 1st way to create an array
	    myIntArray[5] = 50;
	    double[] myDoubleArray = new double[10];

        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[5] + "\n");

        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};  // 2nd way to create an array
        System.out.println(myIntArray2[5]);
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[9]+"\n");

        int[] myIntArray3 = new int[10];   // 3rd way to create an array
        for(int i=0;i<myIntArray3.length;i++){
            myIntArray3[i] = i*10;
           // System.out.println("Element = " + i + " Value = " + myIntArray3[i]  + "\n");
        }

        printArray(myIntArray3);

        int[] myIntArray4 = new int[] {5,4,9,8,7,3};

        System.out.println("4 = " + Arrays.toString(myIntArray4) + "\n");

        Integer[] myIntArray5 = {5,8,9};
        System.out.println("5 = " + Arrays.toString(myIntArray5) + "\n");

        Integer[] myIntArray6 = new Integer[] {88,99,100,487};
        System.out.println("\r" + "6 = " + Arrays.toString(myIntArray6));
    }

    public static void printArray(int[] array) {
        for(int i =0;i<array.length;i++){
            System.out.println("Element = " + i + " Value = " + array[i] + "\n");
        }
    }
}
