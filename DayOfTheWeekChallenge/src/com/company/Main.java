// Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//        The method should not return any value (hint: void)
//
//        Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//        Bonus:
//        Write a second solution using if then else, instead of using switch.
//        Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh
//
//

        package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        DayOfTheWeek(1);
        DayOfTheWeek(2);
        DayOfTheWeek(3);
        DayOfTheWeek(4);
        DayOfTheWeek(5);
        DayOfTheWeek(6);
        DayOfTheWeek(7);
        DayOfTheWeek(8);

    }

    public static void printDayOfTheWeek (int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    // Bonus Solution

    public static void DayOfTheWeek (int day){
        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else if (day == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
