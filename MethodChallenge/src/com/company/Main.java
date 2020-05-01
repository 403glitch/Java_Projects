package com.company;

public class Main {

    public static void main(String[] args) {

        int Hscore = calculateHighScorePosition(1500);
        displayHighScorePosition("John",Hscore );

        Hscore = calculateHighScorePosition(900);
        displayHighScorePosition("Sam", Hscore);

        Hscore = calculateHighScorePosition(400);
        displayHighScorePosition("Kislay", Hscore);

        Hscore = calculateHighScorePosition(50);
        displayHighScorePosition("Adi", Hscore);
    }
    public static void displayHighScorePosition (String playername , int position){
        System.out.println(playername + " Managed to get position " +
                           position + " on the High Scorer Table. ");
    }

    public static int calculateHighScorePosition (int playerscore){
        if (playerscore >= 1000){
            return 1;
        }else if (playerscore >= 500){
            return 2;
        }else if (playerscore >=100){
            return 3;
        }else{
            return  4;
        }
    }
}
