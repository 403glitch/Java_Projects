package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem (String item){
        groceryList.add(item);
    }

    public void printArrayList(){
        System.out.println("You Have = " + groceryList.size() + " Items in your GroceryList");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) + " ," + groceryList.get(i));
        }
    }

    public void modifyGroceryList (int position , String item){
        groceryList.set(position,item);
        System.out.println("Grocery Item " + (position+1) + "has been replaced");
    }

    public void removeGroceryItem (int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem (String search){
//        boolean item = groceryList.contains(search);
//
//        if(item){
//            return "Element Found";
//        } else {
//            return "Element not Found";
//        }

        int position = groceryList.indexOf(search);

        if(position >= 0){  //indexOf() returns position (int) value
            return groceryList.get(position);  // we used get() to get the element at that position
        } else {
            return null;
        }
    }
}
