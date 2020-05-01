package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculatedSCore("XYZ" , 500);
        System.out.println("New Score " + newScore);
        calculatedSCore(75);
        calculatedSCore();
        double cm = calcFeetAndInchesToCentimeters(0 , 1 );
        if (cm <0.0){
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(157);

       }
    public static int calculatedSCore (String playername , int score){
        System.out.println("Player " + playername + " Scored " + score + " points");
        return score * 1000;
    }
    public static int calculatedSCore (int score){
        System.out.println("Unknown Player Scored " + score + " points");
        return score * 1000;
    }
    public static int calculatedSCore (){
        System.out.println("No Player , No Score");
        return 0;
    }


    // Methods Overloading Challenge
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.

    public static double calcFeetAndInchesToCentimeters (double feet , double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid Feet or Inches");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feets, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0){
            return -1;
        }
            double feet = (int) inches /12;
            double remaininginches = (int) inches % 12;
        System.out.println(inches + " inches equal to " + feet + " feet and " + remaininginches);
        return calcFeetAndInchesToCentimeters(feet , remaininginches);
    }

}

