package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        int test = 26 % 5; // 26 % 5 = 1
        System.out.println("26 % 5 = " + test);

        // result = result + 1:
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result = 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result =  result / 3 ;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);



         boolean isAlien = false;
         if (isAlien == false)
             System.out.println("It is not a Alien!");
         
         boolean isSpace = true; // there will be no output
        if (isSpace == false)
            System.out.println("Space is Vast");

        boolean isUFO = true;
        if (isUFO == true){
            System.out.println("I want to see one");
            System.out.println("ASAP");
        }
        boolean isDog = true; // the second sout will get printed because we havn't used CODE BLOCK
        if (isDog == false)
            System.out.println("A good boy");
            System.out.println("A bad boy");


            int topScore = 80;
            if(topScore < 100){
                System.out.println("You have got top score");
            }
            int secondTopscore = 60;
            if ((topScore > secondTopscore) && (topScore < 100) ){
                System.out.println("Greater than secondTopscore and less than 100");
            }
            int thirdTopscore = 81;  // There will be no Output
            if((topScore > thirdTopscore) && (topScore < 100)){
                System.out.println("Greater than thirdTopscore and less than 100");
            }
            if ((topScore > 90) || (secondTopscore <= 90)){
                System.out.println("Either or Both conditions are true");
            }

            boolean isCar = true; //we can apply NOT operator in front of isCar to make the condition right
            if (!isCar == false){
                System.out.println("Test1");
            }
            boolean Bike = true; // we can apply NOT EQUAL to operator to make the condition right
            if (Bike != false) {
            System.out.println("Test2");
            }

            boolean isKar = false;
            if (isKar != true){
                System.out.println("Test3");
            }
             boolean wasKar = (isKar) ? true : false;
            if (!wasKar){
                System.out.println("wasKar is false");
            }

            int ageofClient =20; // example of TERNARY OPERATOR
            boolean is18over20 = ageofClient == 20 ? true : false;
            if (is18over20){
                System.out.println("Test Success");
            }

            boolean isRubik = false;
            if (isRubik != true){
                System.out.println("Result");
            }
            boolean isCube = (isRubik) ? true : false;
            if (isCube == true){
                System.out.println("Result 2");  // Result 2 will not get printed becoz we are saying that chk if isCube value = isRubik value and must be true
            }



    }
}
