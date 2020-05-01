package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myPhoneNumber; // to save phone numbers we created a field
    private ArrayList<Contacts> myContacts; // arrayList for class contacts. The ArrayList variable myContacts will be used with 'this' keyword as it is a field.

    public MobilePhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber; // initializing the field myPhoneNumber
        this.myContacts = new ArrayList<Contacts>(); // Initializing our arrayList (field) which is empty in the constructor
    }

    public boolean addContacts(Contacts contact){
        if(findContact(contact.getName()) >= 0){  //getName is the getter from Contacts class. findContact() is the method used to find a contact
            System.out.println("Contact Exists"); // we are calling our findContact() method then passing contact (parameter of addContact() method)
            return false;                       // as its parameter while also calling the getter from Contact Class becoz contact (parameter) has a data type of
        } else {                              // Contact class so they are linked and it will check if that value exists or not
            myContacts.add(contact);
            return true;
        }
    }

    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts); // indexOf tells the location of the element in the arrayList which is created for class Contacts
    }                                               // we pass contact(parameter) as a value of indexOf() method

    private int findContact (String contactName){ //overloading the previous method
        for(int i=0; i <  this.myContacts.size() ;i++ ){  //  here we are lopping thru all the element in the arrayList checking if
            Contacts contact = this.myContacts.get(i); // the provided name is present or not. If present we will return the name's position
            if(contact.getName().equals(contactName)){ // if not we will return -1
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact ( Contacts old, Contacts newOnes){
        int foundPosition = findContact(old); // create a variable of dataType int and provide findContact() method as its value that will return the position of the existing (old) contactName
        if(foundPosition < 0){
            System.out.println(old.getName() + " Not Found"); // if position is not found it will tell that no contact found
            return false;
        }

        this.myContacts.set(foundPosition, newOnes);  // we are setting the position of new contact in the arrayList
        System.out.println(old.getName() + " was replaced by " + newOnes.getName());
        return true;
    }

    public String queryContact ( Contacts contact){  // its purpose is to return the contact.getName() after checking if this
        if(findContact(contact) >= 0){  // contact(from parameter of queryContact()) exists or not in the ArrayList.
            return contact.getName();
        } else {
            return null;
        }
    }

    public Contacts queryContact(String name){   //This method is similar to above queryContact Method but instead of String class it return type is Contacts Class and parameter is String Class
        int position = findContact(name);// we have created an int variable and have passed the findContact(String) method as its value and have passed the name parameter of the method as a parameter value of findContact()
                                // findContact() method is responsible for looping and find a contact name in the arrayList and the return the position of the element(name) and then storing the position in the Int Variable
        if(position >= 0){
            return  this.myContacts.get(position); // here we are using the get() method of arraylist to Return the element at that position
        } else {                            // the int position variable is storing the position number of the element in th array list and the get() method return the element using the position variable passed to it
            return null;
        }

    }

    public boolean removeContact (Contacts contact){
        int foundPosition = findContact(contact); // we did a similar thing that we have done in updateContact() method
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {   // here we have used for-loop to printContacts
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +  //here get() method is used to get the element using the position
                    this.myContacts.get(i).getPhoneNumber());
        }

    }
}



