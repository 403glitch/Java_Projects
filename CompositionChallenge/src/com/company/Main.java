// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in video 91

package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling (12, "White");

        Bed bed = new Bed (7,"King",4,2,2);

        Lamp lamp = new Lamp("Round",true,5);

        Bedroom bedroom = new Bedroom("XYZ",wall1,wall2,wall3,wall4,ceiling,bed,lamp);//Here we have used the variable name of instances as value becoz we have already
                                                                                            //assigned them value before creating the instance of the primary class
        bedroom.makeBed();                                                                 //The Primary Class is the Bedroom class
        bedroom.getLamp().turnOn();                                                       //As all other classes has been used as datatype in Bedroom class
                                                                                         //That means all other classes are linked to Bedroom Class
    }
}
