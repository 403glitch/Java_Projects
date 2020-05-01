package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimension1 = new Dimensions(20,20,5);
        Case case1 = new Case("Xeron", "Dell", "240",dimension1);

        //Resolution resolution1 = new Resolution(20,20); The alternate method to create an instance of a class inside another instance of a class
        Monitor monitor1 = new Monitor("222","Dell",15, new Resolution(2540,1440));

        MotherBoard motherboard1 = new MotherBoard("Intel 558", "Intel", 2,4,"2.45");

        PC pc = new PC(case1 , monitor1 , motherboard1);

       pc.powerUp(); //powerUp is public class created in PC class

       pc.getMonitor().drawPixel(56,96,"Blue");
       pc.getMotherBoard().loadProgram("IntelliJ");
    }
}
