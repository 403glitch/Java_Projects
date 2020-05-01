package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,10);
        animal.move(55);

        Dog dog = new Dog(1, 1 , 5, 10, 2, 4, 1,20,"Golden");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Goldie ",1,1,12,15,2,2,4);
        fish.move(15);
    }
}
