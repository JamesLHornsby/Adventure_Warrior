package game;

import java.util.Random;
import java.util.Scanner;

public class Encounter() {

    private static Encounter encounter;
    static Scanner sc = new Scanner(System.in);
    int choice;
    boolean goodVal,encountOver;

    private Encounter() {

    }
    public static Encounter getInstance() {
        if (null == encounter) {
            encounter = new Encounter();
        }
        return encounter;
    }

    public void getEncounter() {

        Monster monstie = new Monster();
        String monstieName = monstie.monName;
        int monstieHealth = monstie.monHealth;
        int monstieAttack = monstie.monAttack;
        int monstieSpeed = monstie.monSpeed;


        System.out.println("You encounter a "+monstieName +" with a health of "+String.valueOf(monstieHealth)+
                " and an attack of "+String.valueOf(monstieAttack)+"! Watch out!");

        goodVal =false;
        encountOver =false;
        while(!goodVal)

        {
            while (!encountOver) {
                try {
                    System.out.print("What do you do? [1. Fight 2. Run] ");
                    choice = sc.nextInt();
                    if (choice > 2 || choice < 1) {
                        System.out.println("Selection out of bounds.");
                        goodVal = false;
                    } else if (choice == 1) {
                        goodVal = true;
                        encountOver = combat();
                    } else {
                        goodVal = true;
                        encountOver = run();
                    }
                    if (!encountOver) {
                        System.out.println("The Monster attacks!");
                        defend();
                        if (Player.getPlaHealth <= 0) {
                            encountOver = true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Only numbers, please.");
                    sc.nextLine();
                    goodVal = false;
                }
            }

        }

        private static void defend() {
            int monAttNum = new Random().nextInt(monstieAttack - 1 + 1) + 1;
            plaHealth -= monAttNum;
            System.out.println("The " + monstieName + " attacks you for " + monAttNum + "! Your health is at " + plaHealth + "!");
            System.out.println("");
        }
    }
}
