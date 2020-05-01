package com.company;

public class Delux extends Hamburger {

    public Delux() {
        super("Delux", "Chicken + Ham", 199.99, "Brown");
        super.addHamburgerAddition1("Chips", 19.99);
        super.addHamburgerAddition2("Coke",39.99);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional Items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional Items");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional Items");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional Items");
    }
}
