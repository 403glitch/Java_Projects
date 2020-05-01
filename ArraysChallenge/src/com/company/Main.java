// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int integers){
        int[]  array = new int[integers];
        System.out.println("Enter Value = " + integers + " integer values \r");
        for (int i =0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array1){
        for(int i=0;i<array1.length;i++){
            System.out.println("Elements = " + i + ", Values = " + array1[i]);
        }
    }

    public static int[] sortIntegers(int[] array2){
//        int[] sortedArray = new int[array2.length];
//        for (int i=0;i<array2.length;i++){
//            sortedArray[i] = array2[i];

         // the above code can be replaced by java built-in method
          int[] sortedArray = Arrays.copyOf(array2 , array2.length);
//        }
//        boolean flag = true;
//        int temp;
//        while(flag){
//            flag = false;
//
//            // Element 0     50
//            // Element 1     160
//            // Element 2     40
//
//            for(int i=0;i<sortedArray.length - 1;i++){
//                if(sortedArray[i] < sortedArray[i+1]){
//                    temp = sortedArray[i];
//                    sortedArray[i] =sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }

        Arrays.sort(sortedArray); // we can replace all the code written above with a java built-in method Arrays.sort() to sort an array.

        return sortedArray;
    }

}
