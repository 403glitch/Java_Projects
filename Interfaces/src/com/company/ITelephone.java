package com.company;

public interface ITelephone {
    void powerOn();     // we will not use accessModifiers while defining these methods as they will be implemented by other classes
    void dial(int phoneNumber);  // here we will only create the methods and provide them with parameters
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
