package com.company;

public class Bank {
    int getinterest(){
        return 0;
    }
}

class sbi extends Bank{
    int getinterest (){
        return 1;
    }
}

class boi extends Bank{
    int getinterest (){
        return 2;
    }
}

class axis extends Bank{
    int getinterest (){
        return 3;
    }
}

class polymorphism{

    public static void main(String[] args) {
        Bank b = new sbi();
        System.out.println(b.getinterest() + "\n");

        b = new boi();
        System.out.println(b.getinterest() + "\n");

        b = new axis();
        System.out.println(b.getinterest() + "\n");
    }
}