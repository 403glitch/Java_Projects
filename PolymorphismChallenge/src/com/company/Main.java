// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

package com.company;

    class car{
        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public car(int cylinders, String name) {
            this.engine = true;
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

        public String startEngine(){
            return "Car --> Start Engine";
        }

        public String accelerate (){
            return ("Car --> Accelerating");
        }

        public String brakes(){
            return ("Car --> Brakes Applied");
        }
    }

    class bugatti extends car{

        public bugatti(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Bugatti --> Start Engine";
        }

        @Override
        public String accelerate() {
            return "Bugatti --> Accelerating";
        }

        @Override
        public String brakes() {
            return "Bugatti --> Brakes Applied";
        }
    }

    class pagani extends car{

        public pagani(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Pagani --> Start Engine";
        }

        @Override
        public String accelerate() {
            return "Pagani --> Accelerating";
        }

        @Override
        public String brakes() {
            return "Pagani --> Brakes Applied";
        }
    }

    class mg extends car{

        public mg(int cylinders , String name) {
            super(cylinders,name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + "--> Start Engine";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "--> Accelerating";
        }

        @Override
        public String brakes() {
            return getClass().getSimpleName() + "--> Brakes Applied";
        }
    }

public class Main {

    public static void main(String[] args) {

        car car1 = new car(4,"base");
        System.out.println(car1.accelerate());
        System.out.println(car1.brakes());
        System.out.println(car1.startEngine());
        System.out.println("Base " + car1.getName());
        System.out.println("Cylinders " + car1.getCylinders()  + "\n");

        bugatti car = new bugatti(8,"Veron");
        System.out.println(car.accelerate());
        System.out.println(car.brakes());
        System.out.println(car.startEngine());
        System.out.println("Bugatti " + car.getName());
        System.out.println("Cylinders = " + car.getCylinders() + "\n");

        mg car2 = new mg(4 , "Hector");
        System.out.println(car2.accelerate());
        System.out.println(car2.brakes());
        System.out.println(car2.startEngine());
        System.out.println("MG " + car2.getName());
        System.out.println("Cylinders = " + car2.getCylinders() + "\n");

        pagani car3 = new pagani(6,"Huyara");
        System.out.println(car3.accelerate());
        System.out.println(car3.brakes());
        System.out.println(car3.startEngine());
        System.out.println("Pagani " + car3.getName());
        System.out.println("Cylinders = " + car3.getCylinders());
    }
}
