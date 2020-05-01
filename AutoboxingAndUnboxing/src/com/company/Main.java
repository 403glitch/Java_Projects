package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<Integer>();

        for(int i =0;i<=10;i++){
            intArr.add(Integer.valueOf(i)); //This is AUTOBOXING. using Integer.valueOf() to convert int i --> Integer
        }

        for(int i =0 ; i<=10;i++){
            System.out.println(i + " --> " + intArr.get(i).intValue()); // This is UNBOXING. using .get(i).intValue() to convert Integer i --> int
        }

        Integer intVal = 56; //Integer.valueOf(56)   AUTOBOXING
        int myInt = intVal; // intVal.intVale()   UNBOXING

        System.out.println("\n" + intVal);
        System.out.println(myInt);

        Double dou = 56.6;  //  Double.valueOf(56.6)     AUTOBOXING
        double myDou = dou.doubleValue();  // dou    UNBOXING

        System.out.println("\n" + "***************************" + "\n");

        ArrayList<Double> douArr = new ArrayList<Double>();

        for(double i = 0.0; i <=10.0; i += 0.5){
            douArr.add(Double.valueOf(i));  // douArr.add(i);   This will also run
        }

        for (int i=0;i<douArr.size();i++){
            double value = douArr.get(i).doubleValue();  // double value = douArr.get(i)  This will also run
            System.out.println(i + " ---> " + value);
        }




    }
}
