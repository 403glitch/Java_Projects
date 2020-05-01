//-Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name eReverseArrayChallengef

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = { 1,2,3,4,5,6,888};
        reverse(array1);
        System.out.println(Arrays.toString(array1));

    }

    public static void reverse(int[] array){
        int[] reverse = new int[array.length];
        for (int i=0;i<reverse.length;i++){
            reverse[i] = array[array.length -1 -i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
