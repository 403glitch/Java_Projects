// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8888-999-777");

    public static void main(String[] args) {
        // This is the Process of creating menu for similar type of codes
        boolean quit = false;       // This boolean Variable is just created for looping
        int action = 0;      // Int variable for choosing actions
        startPhone();  // method indication starting a phone
        printActions();  // method for printing the menu actions
        while (!quit) {
            System.out.println("\n" + "Enter Actions");  // for accepting user input
            action = s.nextInt();
            s.nextLine();

            switch (action) {  // this Switch-Case statement will print outputs based on action (1 to 6) input by user

                case 0:
                    System.out.println("Shutting Down \n");
                    quit = true;  // We are shutting down the phone so the loops needs to exit
                    break;

                case 1:
                    mobilePhone.printContacts();   // printContacts() methods is in MobilePhone Class to print contact list
                    break;

                case 2:
                    addNewContact();  // to add a new contact
                    break;

                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();

                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void startPhone() {
        System.out.println("Android Starting");
    }

    private static void printActions() {
        System.out.println("\nAvailable Actions");
        System.out.println(" 0 - Shutdown\n" +
                " 1 - Print Contacts\n" +
                " 2 - Add Contact\n" +
                " 3 - Update Contact\n" +
                " 4 - Remove Contact\n" +
                " 5 - Check an Existing Contact\n" +
                " 6 - Print All actions\n");
        System.out.println("Choice Action");
    }

    private static void addNewContact() {
        System.out.println("Enter New Contact Name");   // printout to accept user input
        String name = s.nextLine();                 // save the input in variable name
        System.out.println("Enter Phone Number"); // printout to accept user input
        String phone = s.nextLine();            // save the input in phone variable
        Contacts newContact = Contacts.newContact(name, phone);  // create a variable newContact of dataType Contacts(class)
        // and pass newContact() method of class Contacts as its value
        //[we are able to pass Contacts class directly because the method we passed with Contacts Class is Static similar to this method and Public]
        // And pass the variable name and phone as value to newContact() method.

        if (mobilePhone.addContacts(newContact)) {  // the addContact method has return type of boolean and if the passed parameter is not present in the list
            System.out.println("New Contact = " + name + ", Phone = " + phone); // it will add the contact
        } else {
            System.out.println("Cannot add contact " + name + " already on file");  // else it will show that the contact already exists
        }
    }

    private static void updateContact() {
        System.out.println("Existing Contact Name");  // Asking user for user input
        String existing = s.nextLine();  // Storing the input in a String Variable
        Contacts existingContact = mobilePhone.queryContact(existing);  // The queryContact method used here is part of MobilePhone class and accepts a String Variable as its parameter and uses get() method to used position as a parameter to return the element
        // the returned Contacts variable is stored in the Contacts existingContact variable we have created to store it.
        if (existingContact == null) {  // and if the element passed by the get() method to the existingContact variable is null
            System.out.println("Contact not Found"); // print this on the screen
            return;
        }
        // As the contact does not exist we will provide the user a way to store that contact Name and Number using the scanner class
        System.out.println("Enter new contact name: ");
        String newCon = s.nextLine();
        System.out.println("New Number");
        String newNum = s.nextLine();
        // now we will create a new record to save this newCon and newNum
        Contacts newContact = Contacts.newContact(newCon, newNum); // here we have called our newContact method from Contacts class as it is used to create new contacts
        // the variable newContact has a dataType of Contacts
        //now we will update our contact list by calling the mobilePhone class instance and the method updateContact() which is a part of mobilePhone Class
        mobilePhone.updateContact(existingContact, newContact);// we will pass the existingContact variable for parameter old(which is for old contacts) and newContact for parameter newOnes which is for storing new contacts
    }

    // the removeContact() method code is similar to updateContact() method code
    private static void removeContact() {
        System.out.println("Existing Contact Name");  // Asking user for user input
        String existing = s.nextLine();  // Storing the input in a String Variable
        Contacts existingContact = mobilePhone.queryContact(existing);  // The queryContact method used here is part of MobilePhone class and accepts a String Variable as its parameter and uses get() method to use position as a parameter to return the element
        // the returned Contacts variable is stored in the Contacts existingContact variable we have created to store it.
        if (existingContact == null) {  // and if the element passed by the get() method to the existingContact variable is null
            System.out.println("Contact not Found"); // print this on the screen
            return;
        }
        //This code ^ above will check if the contact exist in our arrayList or not

        if(mobilePhone.removeContact(existingContact)){ // here we put an if-statement to and check if the provided condition is true or not
            // here we have called our instance of mobilePhone and then the method removeContact() which is part of MobilePhone class and then pass the existingContact variable as a parameter to removeContact() to delete the element
            System.out.println("Deleted");
        } else {
            System.out.println("Error");
        }

    }

    //The queryContact() method code is similar to removeContact() method code
    private static void queryContact() {
        System.out.println("Existing Contact Name");  // Asking user for user input
        String existing = s.nextLine();  // Storing the input in a String Variable
        Contacts existingContact = mobilePhone.queryContact(existing);  // The queryContact method used here is part of MobilePhone class and accepts a String Variable as its parameter and uses get() method to use position as a parameter to return the element
        // the returned Contacts variable is stored in the Contacts existingContact variable we have created to store it.
        if (existingContact == null) {  // and if the element passed by the get() method to the existingContact variable is null
            System.out.println("Contact not Found"); // print this on the screen
            return;
        }
        //This code ^ above will check if the contact exist in our arrayList or not

        System.out.println("Name : " + existingContact.getName() + "Phone Number: " + existingContact.getPhoneNumber());
        // In code ^ above we are printing out our queried name and phone number
        //for name we called our variable existingContact which is part of class Contacts and we called our method getName() with the variable to extract name
        //and for phone number we called our variable existingContact which is part of class Contacts and we called our method getPhoneNumber() with the variable to extract phone number

    }
}
