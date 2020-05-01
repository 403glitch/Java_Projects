package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog (int brain , int body , int size , int weight, int eyes , int legs , int tail , int teeth , String coat){
        super("Tommy", brain, body, size ,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    public void eat(){
        System.out.println("Dog.eat Called");
        chew(); // calls the method chew method of dog class (base class)
        super.eat(); //calls the eat method on animal class (parent class)
    }

    public void walk(){
        System.out.println("Dog.walk called");
        move(6);
    }

    public void run(){
        System.out.println("Dog.run Called");
        move(12);
    }


}
