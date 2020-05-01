package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte
        //string
        //short
        //long
        //double
        //float
        //int
        //char
        //boolean
        String myString = "This is a String";
        System.out.println("myString1 = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString2 = " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("Finale = " + myString);
        String numberString = "250";
        numberString = numberString + "250";
        System.out.println("Answer = " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastStringINT = " + lastString);
        double myDouble = 120.47d;
        lastString = lastString + myDouble;
        System.out.println("AnswerDOUBLE = " + lastString);
        String mySTR1 = "Hello There";
        mySTR1 = mySTR1 + " - by Pennywise";
        System.out.println(mySTR1);
    }

}
