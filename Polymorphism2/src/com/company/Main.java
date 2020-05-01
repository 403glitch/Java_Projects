package com.company;


class bank{
    int interest(){
        return 0;
    }
}

class sbi extends bank{
    int interest (){
        return 1;
    }
}

class boi extends bank{
    int interest (){
        return 2;
    }
}

class axis extends bank{
    int interest (){
        return 3;
    }
}

public class Main {

    public static void main(String[] args) {
        bank b;

        b = new sbi();
        System.out.println("Interest = " + b.interest() + "\n");

        b = new boi();
        System.out.println("Interest = " + b.interest() + "\n");

        b = new axis();
        System.out.println("Interest = " + b.interest() + "\n");
    }
}
