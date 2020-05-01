package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Max Value = " + myMaxFloatValue);
        System.out.println("Float Min Value = " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Max Value = " + myMaxDoubleValue);
        System.out.println("Double Min Value = " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00d / 3.00d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberofPounds = 200d;
        double convertedKilograms = numberofPounds * 0.45359237d;
        System.out.println("Answer Converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
