package com.company;

public class Main {

    public static void main(String[] args) {
	int highscore = completescore(true, 800, 5, 100);
        System.out.println("Final Score = " + highscore);

        highscore = completescore(true, 1000, 8, 200);
        System.out.println("Final Score = " + highscore);
    }

    public static int completescore (boolean gameover, int score, int levelcompleted, int bonus) {
        if (gameover){
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 2000;
            return  finalscore;
        }else{
            return -1;
        }
    }
}
