package com.company;

public class Main {

    public static void main(String[] args) {
        String numAsString = "2020";
        System.out.println("Number As String = " + numAsString);

        int num = Integer.parseInt(numAsString);
        System.out.println("Number = " + num);

        numAsString += 1;
        num += 1;
        System.out.println(numAsString);
        System.out.println(num);

        String doubAsString = "2020.455";
        double num2 = Double.parseDouble(doubAsString);
        System.out.println("Double = " + (num2 + 5.55));
    }
}
