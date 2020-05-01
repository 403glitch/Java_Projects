package com.company;

public class Vehicle {

    private int wheels;
    private int speed;
    private int doors;
    private int gear;
    private int body;

    public Vehicle(int wheels, int speed, int doors , int body) {
        this.wheels = wheels;
        this.speed = speed;
        this.doors = doors;
        this.gear = 0;
        this.body = body;

    }

    public int getWheels() {
        System.out.println("No of Wheels = " + wheels);
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getSpeed() {
        System.out.println("Speed of Vehicle " + speed + " km/h");
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDoors() {
        System.out.println("No of Doors = " + doors);
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGear() {
        if(speed >= 10 && speed < 60){
            System.out.println("Gear is 1");
        } else if (speed >= 60 && speed < 80){
            System.out.println("Gear is 2");
        } else if (speed >= 80 && speed < 110){
            System.out.println("Gear is 3");
        } else if (speed >= 110 && speed < 120){
            System.out.println("Gear is 4");
        } else if (speed >= 120 && speed <= 138){
            System.out.println("Gear is 5");
        } else if (speed > 138){
            System.out.println("Gear is 5");
            System.out.println("Vehicle is Out Of Control");
        }else {
            System.out.println("Neutral");
        }
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
   }

    public int getBody() {
        System.out.println("Body =" + body);
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }
}
