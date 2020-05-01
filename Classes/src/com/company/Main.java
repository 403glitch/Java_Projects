package com.company;

public class Main {

    public static void main(String[] args) {
        Car buggati = new Car();
        Car pagani = new Car();

        buggati.setModel("VeRoN");
        pagani.setModel("HuYaRa");

        System.out.println("Model name " + buggati.getModel());
        System.out.println(pagani.getModel());
    }
}
