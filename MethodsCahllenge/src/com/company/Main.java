package com.company;

public class Main {

    public static void main(String[] args) {
        int highscoreposition = calculateHighScore(1500);
        displayHighScorePosition("John", highscoreposition);

        highscoreposition = calculateHighScore(900);
        displayHighScorePosition("Sam", highscoreposition);

        highscoreposition = calculateHighScore(400);
        displayHighScorePosition("Kislay", highscoreposition);

        highscoreposition = calculateHighScore(50);
        displayHighScorePosition("Adi", highscoreposition);
    }

    public static void displayHighScorePosition(String playerName, int Position) {
        System.out.println(playerName + " managed to get into position " +
                Position + " on the high score table");
    }

    public static int calculateHighScore(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
                // a different approach without using multiple return statement by creating a int named position and then changing its value as per need
        int position = 4;  // assuming position 4 will be returned if none other condition is true

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }

        return position;
    }
}