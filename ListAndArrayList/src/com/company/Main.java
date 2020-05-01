package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList gr = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter choices : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    gr.printArrayList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Enter an Grocery Item");
        gr.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter Item Number:");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Replacement Item");
        String newItem = sc.nextLine();
        gr.modifyGroceryList(itemNo-1,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter Item Number");
        int itemNo = sc.nextInt();
        sc.nextLine();
        gr.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.println("Item For Search");
        String searchItem = sc.nextLine();
        if (gr.findItem(searchItem) != null){
            System.out.println("Item " + searchItem + " is in our List");
        } else {
            System.out.println(searchItem + " is not in our List");
        }
    }
}
