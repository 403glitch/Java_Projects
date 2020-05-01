package com.company;

public class Main {

//  this is one method for calling a method inside another method

//    public static void main(String[] args) {
//
//	   calculateScore(true, 800, 5 ,100);
//
//	   calculateScore(true, 10000,8,200);
//
//    }
//
//    public static void calculateScore(boolean gameOver , int score , int levelCompleted , int bonus) {
//
//		if (gameOver){
//			int finalScore = score + (levelCompleted * bonus);
//			System.out.println("Your Final Score = " + finalScore);
//		}
//	}
      // we can also do something like this for more convenience

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver , score , levelCompleted , bonus);
		System.out.println("Your Final Score = " + highScore);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		highScore = calculateScore(gameOver , score , levelCompleted , bonus);
		System.out.println("Your Final Score = " + highScore);

	}

	public static int calculateScore(boolean gameOver , int score , int levelCompleted , int bonus) {

		if (gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
		}


//		return finalScore;  //we can also use this process it is the same deal
//	    }
//		return -1;


	}

