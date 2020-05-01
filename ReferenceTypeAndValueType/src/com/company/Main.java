package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myInt = 10;
        int myInt2 = myInt;

        System.out.println("myInt = " + myInt);
        System.out.println("myInt2 = " + myInt2);

        myInt2 ++;

        System.out.println("Updated myInt = " + myInt);
        System.out.println("Updated myInt2 = " + myInt2 + "\n");   //example of VALUE TYPES

        int[] myArray = new int[5];
        int[] myArray2 = myArray;

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("myArray2 = " + Arrays.toString(myArray2));

        myArray2[0] = 15;

        System.out.println("Updated myArray = " + Arrays.toString(myArray));
        System.out.println("Updated myArray2 = " + Arrays.toString(myArray2) + "\n");

//        myArray[3] = 15;
//
//        System.out.println("Updated 2 myArray = " + Arrays.toString(myArray));
//        System.out.println("Updated 2 myArray2 = " + Arrays.toString(myArray2) + "\n");

        myArray2 = new int[] {12,34,56,78,910};
        modifiedArray(myArray2);
//        modifiedArray(myArray);

        System.out.println("Modified 2 myArray = " + Arrays.toString(myArray));
        System.out.println("Modified 2 myArray2 = " + Arrays.toString(myArray2));
    }

    public static void modifiedArray (int[] array){
        array[3] = 2;

    }
}
