package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;  // these are private fields for class DeskPhone
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {   // we created constructor so that an instance of this class can be created in another class
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override              // these are the methods implemented from the Interface ITelephone
    public void powerOn(){ // all of the implemented methods are Overridden and the here We will add the Access Modifiers
        System.out.println("Desk Phone does not have a Power Button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber);

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
