// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("Initial Page Count = " + printer.getPagesPrinted());
        int printOut = printer.printPages(15);
        System.out.println("Pages Printed = " + printOut  + " Print Count For Printer = " + printer.getPagesPrinted());
        printOut = 35;
        System.out.println("Pages Printed = " + printOut  + " Print Count For Printer = " + printer.getPagesPrinted());
    }
}
