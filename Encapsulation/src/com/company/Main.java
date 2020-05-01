package com.company;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "LMN";
        player.health = 100;
        player.weapon = "Double Ballads";

        int damage = 50;
        player.loseHealth(damage);
        System.out.println("Player Health = " + player.healthRemaining());
        System.out.println(player.name);

        damage = 50;
        player.loseHealth(damage);
        System.out.println("Player Health = " + player.healthRemaining() + "\n");

        EnhancedPlayer player0 = new EnhancedPlayer("Dante",50,"Sword");
        System.out.println("Initial Health of P1 = " + player0.getHealth());

        EnhancedPlayer player2 = new EnhancedPlayer("Dante",200,"Sword");
        System.out.println("Initial Health of P2 = " + player2.getHealth());
    }
}
