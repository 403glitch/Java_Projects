package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min Value = " + myMinIntValue);
        System.out.println("Max Value = " + myMaxIntValue);
        System.out.println("MAX Busted value = " + (myMaxIntValue + 1));
        System.out.println("MIN Busted Value = " + (myMinIntValue - 1));



        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE ;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE ;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 2_147_483_647_234_555L ;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE ;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        System.out.println("Long Literal Value = " + myLongValue);




        int mytotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNEwShortValue = (short) (myMinShortValue / 2);

    }
}
