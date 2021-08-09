package game;

import java.util.Random;
import java.util.Scanner;

public class Encounter {
    //public static Player player = new Player();
    static Scanner sc = new Scanner(System.in);
    int choice;
    boolean goodVal,encountOver;

/*    int plaHealth = Player.getPlaHealth();
    int plaAttack = Player.getPlaAttack();
    int plaSpeed = Player.getPlaSpeed();*/

    Encounter() {
        getEncounter();
    }


    public void getEncounter() {

/*        int plaHealth = Player.getPlaHealth();
        int plaAttack = Player.getPlaAttack();
        int plaSpeed = Player.getPlaSpeed();*/

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
                    int plaHealth = Player.getPlaHealth();
                    int plaAttack = Player.getPlaAttack();
                    int plaSpeed = Player.getPlaSpeed();
                    

                    System.out.print("What do you do? [1. Fight 2. Run] ");
                    choice = sc.nextInt();
                    if (choice > 2 || choice < 1) {
                        System.out.println("Selection out of bounds.");
                        goodVal = false;
                    } else if (choice == 1) {
                        goodVal = true;
                        Action action = new Action(plaHealth,plaAttack,plaSpeed,monstieName,monstieHealth,monstieAttack,monstieSpeed);
                        encountOver = action.getCombat();

                    } else {
                        goodVal = true;
                        Action action = new Action(plaHealth,plaAttack,plaSpeed,monstieName,monstieHealth,monstieAttack,monstieSpeed);
                        encountOver = action.getRun();
//                        encountOver = run();
                    }
                    if (!encountOver) {
                        System.out.println("The Monster attacks!");
                        Action action = new Action(plaHealth,plaAttack,plaSpeed,monstieName,monstieHealth,monstieAttack,monstieSpeed);
                        action.getDefend();
                        if (plaHealth <= 0) {
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
    }

}
