package com.company;

public class Car extends Vehicle {
    private int spoiler;
    private String engine;

    public Car (int speed, int doors , int spoiler , String engine){
        super (4,speed,doors,1);
        this.spoiler = spoiler;
        this.engine = engine;
    }

    public String getEngine() {
        System.out.println("Engine = " + engine);
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


    public int getSpoiler() {
        System.out.println("No of Spoiler = " + spoiler);
        return spoiler;
    }

    public void setSpoiler(int spoiler) {
        this.spoiler = spoiler;
    }

}
