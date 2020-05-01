//        Write a method with the name sumDigits that has one int parameter called number.
//
//        If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//        The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers, so also return -1 for negative numbers.
//
//        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//        Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//        Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
//
//        Hint:
//        Use n % 10 to extract the least-significant digit.
//        Use n = n / 10 to discard the least-significant digit.
//        The method needs to be static like other methods so far in the course.
//
//        Tip:
//        Create a project with the name DigitSumChallenge.

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(555));
        System.out.println(sumDigits(-555));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(26854985));
    }

    public static int sumDigits(int number){
        if(number < 10 || number < 0){
            return -1;
        }

        int sum = 0;

        while (number > 0){
            int digit = number % 10;  // extract the least-significant digit
            sum += digit;
            number /= 10;  // discard the least-significant digit (it is an iteration step the )
        }
        return sum;
    }
}

// Summary
//The code receives a number:
//
//        First the code checks if the value is less than 10. If it is it returns -1.
//
//        Then it makes the int "sum", and gives it the value of "0".
//
//        the while statements says that as long as the number is greater than "0", it will run.
//
//        Next it creates an int "digit" within the while statement. This means that "digit" gets created and destroyed every time the while statement is run.
//
//        "digit" is the leftover from number/ 10. (if number was 13, "digit" in the first iteration would be 3).
//
//        it then adds "digit" to "sum" (if it makes more sense then it could say "sum = sum + digit" instead), so every loop it updates sum to a new value.
//
//        (Because "sum" was created outside the loop, the updated value is used in the following loop).
//
//        after that it divides the initial "number" by 10. This effectively removes the digit that it just added to sum.
//
//        Once the "number" value reaches 0, it returns the current value of "sum".
