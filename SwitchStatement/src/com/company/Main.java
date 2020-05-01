package com.company;

public class Main {

    public static void main(String[] args) {
//      int value = 3;
//      if (value == 1){
//          System.out.println("Value is 1");
//      } else if (value == 2){
//          System.out.println("Value is 2");
//      } else {
//          System.out.println("Was not 1 or 2");
//      }


        int value = 4;

        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually the value = " + value);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }


        // Challenge



        char alpha = 'a';

        switch (alpha) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println("Found It");
                System.out.println("Character is = " + alpha);
                break;
        }

        // Secondary Solution

        char beta = 'f';

        switch (beta) {
            case 'a':
                System.out.println("It is a");
                break;

            case 'b':
                System.out.println("It is b");
                break;

            case 'c':
                System.out.println("It is c");
                break;

            case 'd':
                System.out.println("It is d");
                break;

            case 'e':
                System.out.println("It is e");
                break;

            default:
                System.out.println("Neither a,b,c,d,e");
                break;
        }



        String month = "JanuARy";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
        }

        String month2 = "June";

        switch (month2.toLowerCase()){
            case "JUne":
                System.out.println("June");
                break;

            default:
                System.out.println("Lowercase , Uppercase Problem");
                break;
        }


        String month3 = "april";

        switch (month3.toUpperCase()){
            case "APRIL":
                System.out.println("April");
                break;

            default:
                System.out.println("Lowercase , Uppercase Problem");
                break;
        }
    }
}
