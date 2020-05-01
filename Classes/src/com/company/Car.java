package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validation = model.toLowerCase();
        if (validation.equals("veron") || validation.equals("huyara")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
