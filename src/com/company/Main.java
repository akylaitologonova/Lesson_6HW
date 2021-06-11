package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player(250, 50);
        System.out.println("Player" + " " + player.getHealth() + " " + player.getDamage());

        Boss boss = new Boss(350, 70);
        System.out.println("Boss" + " " + boss.getHealth() + " " + boss.getDamage());

        Warrior warrior = new Warrior(200, 30);
        System.out.println("Warrior" + " " + warrior.getHealth() + " " + warrior.getDamage());

        Magical magical = new Magical(320, 50);
        System.out.println("Magical" + " " + magical.getHealth() + " " + magical.getDamage());

        Mental mental = new Mental(270, 80);
        System.out.println("Mental" + " " + mental.getHealth() + " " + mental.getDamage());


    }
}
