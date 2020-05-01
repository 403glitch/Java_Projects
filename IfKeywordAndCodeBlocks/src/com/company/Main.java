package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your Score was 5000");
        } else {
            System.out.println("Print This");
        }

        int PUBG = 21;
        if (PUBG <= 21) {
            System.out.println("Winner");
        } else {
            System.out.println("Loser");
        }

        int COD = 500;
        if (COD <= 400 || COD >= 500) {
            System.out.println("Less Than");
        } else if (COD == 500) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Sure");
        }

        if (gameOver == true){ // (gameOver) = (gameOver == true)
            int FinalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score = " + FinalScore);
        }

//        int Score = 10000;
//        int LevelCompleted = 8;
//        int Bonus = 200;
//
//        if (gameOver){
//            int FinalScore = Score + (LevelCompleted * Bonus);
//            System.out.println("Finale = " + FinalScore);
//        }



     // Another Approach Can be we can use the same variables w/o defining data types but we will change the value

      score = 10000;
      levelCompleted = 8;
      bonus = 200;

      if (gameOver){
          int FinalScore = score + (levelCompleted * bonus);
          System.out.println("Your Final Score = " + FinalScore);
      }
    }
}