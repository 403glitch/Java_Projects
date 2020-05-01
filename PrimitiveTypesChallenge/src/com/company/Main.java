package com.company;

public class Main {

    public static void main(String[] args) {
        byte myCHbyte = 10;
        int myCHint = 50;
        short myCHshort = 20;
        long myCHlong = 50000L;

        System.out.println("myAnswer = " + (myCHlong + 10*(myCHbyte + myCHint + myCHshort)));

        long SecndTechnique = 50000L + 10L * (myCHbyte + myCHint + myCHshort);
        System.out.println("2nd Tech = " + SecndTechnique);

        short shortTotal = (short)(1000 + 10 * (myCHbyte + myCHint + myCHshort));
        System.out.println("Short Challenge =" + shortTotal);
    }
}
