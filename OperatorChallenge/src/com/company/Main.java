package com.company;

public class Main {

    public static void main(String[] args) {
	 double first = 20.00d;
	 double second = 80.00d;
	 double firstandsecond = ((first + second) * 100.00d); // Answer 10000
        System.out.println("First + Second x 100 = " + firstandsecond);
      double remainder = firstandsecond % 40.00d; // 10000 / 40
        System.out.println("Remainder = " + remainder);
      boolean isremainder = (remainder == 0) ? true : false; // using ternary operator to check if the remainder is equal to 0 [true] or [false]
        if (isremainder) {
            System.out.println("Is Remainder = 0 :- " + isremainder); }
      if (!isremainder){ // giving a condition is remainder is not equal to 0 print the given statement
          System.out.println("Got some Remainder");
      }





    }
}
