package game;

import java.util.Scanner;

public class Main {
    public static Main main = new Main();
    //public static Player player = Player.getInstance();



    static String monName;
    static int monHealth, monAttack, monSpeed, encounterCount;
    //static int plaHealth=10, plaAttack=5, plaSpeed=5;

    public Main() {

    }

    public static void main(String[] args) {
        boolean isOver = false;
        boolean ifWon = false;
        //Player.setPlaHealth(10);
        System.out.println("");
        System.out.println("Welcome to Adventure Warrior 2! " +
                "You step outside of your Adventurer's house and face a world of adventure!");

        while (!isOver) {

                while (encounterCount <= 2) {
                    if (Player.getPlaHealth() >0) {
                        Encounter encounter = new Encounter();
                        encounter.getEncounter();
                        encounterCount += 1;
                    } else {
                        encounterCount = 3; //so game is over.
                    }
                }
                isOver = true;

        }
        if (Player.getPlaHealth() > 0) {
            System.out.println("Good adventuring! The game is complete.");
        } else {
            System.out.println("You gave it your best, but your health is too low. Game over.");
        }
    }

/*    public static void getEncounter() {
        int choice;
        boolean goodVal,encountOver;

        getMonster();
        System.out.println("You encounter a " + monName + " with a health of " + String.valueOf(monHealth) +
                " and an attack of " + String.valueOf(monAttack) + "! Watch out!");

        goodVal = false;
        encountOver = false;
        while (!goodVal) {
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
                        encountOver=run();
                    }
                    if (!encountOver) {
                        System.out.println("The Monster attacks!");
                        defend();
                        if (plaHealth <=0) {
                            encountOver=true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Only numbers, please.");
                    sc.nextLine();
                    goodVal = false;
                }
            }
        }
        //add up to three encounters
        //
    }*/
/*
    public static void getMonster() {

        int encounterNum = new Random().nextInt(5 - 1 + 1) + 1;

        if (encounterNum == 1) {
            monName = "Slime";
            monHealth = 1;
            monAttack = 1;
            monSpeed = 1;
        }
        if (encounterNum == 2) {
            monName = "Wolf";
            monHealth = 2;
            monAttack = 2;
            monSpeed = 2;
        }
        if (encounterNum == 3) {
            monName = "Goblin";
            monHealth = 3;
            monAttack = 3;
            monSpeed = 3;
        }
        if (encounterNum == 4) {
            monName = "Troll";
            monHealth = 4;
            monAttack = 4;
            monSpeed = 4;
        }
        if (encounterNum == 5) {
            monName = "Dragon";
            monHealth = 5;
            monAttack = 5;
            monSpeed = 5;
        }
    }*/

/*    public static boolean combat() {
        boolean comOver;
        int attackNum = new Random().nextInt(plaAttack - 1 + 1) + 1;

        System.out.println("With your attack of "+plaAttack+", you hit the " + monName + " for " + attackNum + "!");
        monHealth -= attackNum;
        if (monHealth <= 0 ) {
            System.out.println("You defeated the " + monName + "!");
            System.out.println("");
            comOver = true;

        } else {
            System.out.println("You did not defeat the " + monName + "! The monster's health is now "+ monHealth);
            System.out.println("");
            comOver=false;
        }
        return comOver;
    }*/

/*    public static boolean run() {
        boolean runOver;
        int runNum = new Random().nextInt(5-1+1)+1;
        System.out.println("With your run of 5, you tried running away from the "+ monName +" for "+runNum+"!");
        if (runNum >= monSpeed) {
            System.out.println("You ran away from the "+ monName +"!");
            System.out.println("");
            runOver = true;
        } else {
            System.out.println("You did not run away from the "+ monName +"!");
            System.out.println("");
            runOver = false;
        }
        return runOver;
    }*/

/*    private static void defend() {
        int monAttNum = new Random().nextInt(monAttack-1+1)+1;
        plaHealth -= monAttNum;
        System.out.println("The "+ monName +" attacks you for "+monAttNum+"! Your health is at "+plaHealth+"!");
        System.out.println("");
    }*/

}
