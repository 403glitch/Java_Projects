package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> places = new LinkedList<String>();

//        places.add("Bihar");
//        places.add("U.P");
//        places.add("M.P");
//        places.add("Himachal");
//        places.add("Jharkhand");
//
//        printList(places);
//
//        places.add(2,"Orrisa");
//
//        printList(places);
//
//        places.remove(5);
//
//        printList(places);

        inOrder(places,"Bihar");
        inOrder(places,"U.P");
        inOrder(places,"M.P");
        inOrder(places,"Himachal");
        inOrder(places,"Jharkhand");
        inOrder(places,"Chennai");
        inOrder(places,"Tamil Nadu");
        inOrder(places,"Andhra Pradesh");
        inOrder(places,"Chennai");
        inOrder(places,"Tamil Nadu");
        inOrder(places,"Kerela");

        printList(places);

        visit(places);
    }

    public static void printList(LinkedList<String> list){
//        for (int i=0;i<list.size();i++){
//            System.out.println("Visiting " + list.get(i));
//        }
//        System.out.println("**************************************");
        Iterator<String> i = list.iterator();
        while(i.hasNext()){  // here hasNext() is checking if there is another element in the list and if there is we will continue to loop
            System.out.println("Visiting " + i.next());  // it will print the current element and then the next() will jump to the next element and we will print it
        }
        System.out.println("**************************************");
    }

    private static boolean inOrder(LinkedList<String> list ,String newCity){
        ListIterator<String> listIterator = list.listIterator();  //this is not pointing to our first record
        // here we are referring our listIterator Variable 'listIterator' to 'list' which is a LinkedLIst Variable
        while(listIterator.hasNext()){  //hasNext() checks if there is a record or not
            int compare = listIterator.next().compareTo(newCity);  //it will compare our first record/element to the value of newCity parameter,,, listIterator.next() is pointing towards our first record
                //compareTo() returns a int value a number as its return type
            if(compare == 0){
                // 0 means equal i.e don't add the value in the linkedList
                System.out.println(newCity + " Already Exists");
                return false;
            } else if(compare > 0){  // as compare is greater than 0 the new city should be placed before the previously entered element
                //newCity should appear before this one
                listIterator.previous();
                listIterator.add(newCity);
                return true;
          /*  }else if(compare < 0){
                // move to next city
                // we have used next() in our compare==0 so the entry will be moved to next place in the list and here we dont need to do anything
         */ }
        }
        listIterator.add(newCity); //to add rare entries that should be placed at the last position of the list
        return true;
    }

    private static void visit(LinkedList city){   // we will pass a linkedList as a value to its parameter

        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> list = city.listIterator();

        if(city.isEmpty()){   //isEmpty() chks if the string is empty or not
            System.out.println("No Cities in List");
            return;
        } else {  // if it is not empty we use next() to move to the first element in the list
            System.out.println("Now Visiting = " + list.next());  // here the next() points to the first item in the list
            printMenu();  // then it prints all the options from the menu
        }

        while(!quit){
            int action = s.nextInt();   // action will accept user input in the form of integer
            s.nextLine(); // to jump to next line w/o error
            switch(action){   //option for menu's
                case 0:
                    System.out.println("Holiday Over");
                    quit = true;
                    break;
                case 1:
                    if(list.hasNext()){  // hasNext() chks if there is another item in the list or not
                        System.out.println("Now Visiting " + list.next());  // here next() will move to the next item in the list
                    } else {
                        System.out.println("Reached the END of the List");  // else it will print that we have reached the end of the list
                    }
                    break;

                case 2:
                    if(list.hasPrevious()){    // hasPrevious() checks if there is previous item available in the list or not
                        System.out.println("Now Visiting " + list.previous());  // here previous() moves to the previous (backward) in the list
                    } else {
                        System.out.println("Reached at START of list"); // else it will print that we have reached the top of the list
                    }
                    break;

                case 3:
                    printMenu();  // it will print all the options
                    break;
            }

        }
    }

    private static void printMenu(){   // it will print all the options in the menu
        System.out.println("Available Options");
        System.out.println("0 - to quit");
        System.out.println("1 - to move down in the list");
        System.out.println("2 - to move up in the list");
        System.out.println("3 - to print menu");
    }


}
