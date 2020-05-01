package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] {99,56,88,33,456,25};

        System.out.println("OG " + Arrays.toString(arr) + "\n");
//        Arrays.sort(arr);
//
//        System.out.println("Sorted arr Ascending " + Arrays.toString(arr) + "\n");

        int[] copy = Arrays.copyOf(arr,8 );
        copy[6] = 1;
        copy[7] = 3;

        System.out.println("Copy "  +Arrays.toString(copy) + "\n");

        int[] copy2 = Arrays.copyOf(arr,arr.length );

        System.out.println("Copy 2 "  +Arrays.toString(copy2) + "\n");

        Arrays.sort(copy);

        System.out.println("Sorted " + Arrays.toString(copy) + "\n");

        Arrays.sort(copy2);

        System.out.println("Sorted 2 " + Arrays.toString(copy2) + "\n");

        System.out.println("****************************************************");

        Integer[] arr2 = {10, 5,1,3,12,525};

        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.println("Descending " +Arrays.toString(arr2));

    }
}
