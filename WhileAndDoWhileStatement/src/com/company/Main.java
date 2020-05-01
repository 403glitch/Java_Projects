package com.company;

public class Main {

    public static void main(String[] args) {

	 int count = 1;
	 while(count != 6){
         System.out.println("Count Value = " + count);
         count ++;
     }

	  count = 1;
	 while(true){
	     if(count == 6){
	         break;      }
        System.out.println("Count Value = " + count);
	     count ++;
     }

       System.out.println("*************************************************************");

      count = 6;
       while(count != 6){   // This will not execute because the while statement is false as the value of count is already 6
            System.out.println("Count Value = " + count);
           count ++;
       }

       System.out.println("*************************************************************");

       count = 1;
       do{
           System.out.println("Count = " + count);
          count ++;
       } while (count != 6);


	 for (count = 1; count < 6 ; count ++){
        System.out.println("Count value is " + count);
     }


        System.out.println("**************************Challenge ******************************************************");


      }



}