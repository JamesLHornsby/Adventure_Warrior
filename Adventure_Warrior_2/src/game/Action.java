package game;

import java.util.Random;

public class Action {
    public static boolean combat() {
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
    }

    public static boolean run() {
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
    }

}
