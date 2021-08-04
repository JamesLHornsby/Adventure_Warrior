package game;

import java.util.Random;

public class Encounter() {
    int choice;
    boolean goodVal,encountOver;

    public class getEncounter() {

        Monster monster = Monster.getMonster();

        System.out.println("You encounter a "+monName +" with a health of "+String.valueOf(monHealth)+
                " and an attack of "+String.valueOf(monAttack)+"! Watch out!");

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
            int monAttNum = new Random().nextInt(monAttack - 1 + 1) + 1;
            plaHealth -= monAttNum;
            System.out.println("The " + monName + " attacks you for " + monAttNum + "! Your health is at " + plaHealth + "!");
            System.out.println("");
        }
    }
}
