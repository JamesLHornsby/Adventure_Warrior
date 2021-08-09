package game;

import java.util.Random;

public class Action {
    public String monName;
    public int plaAttack;
    public int monHealth;
    public int monAttack;
    public int plaSpeed;
    public int monSpeed;
    public int plaHealth;

    public Action(int playerHealth, int playerAttack,int playerSpeed, String monsterName, int monsterHealth, int monsterAttack, int monsterSpeed) {
        //getCombat();
        this.plaHealth = playerHealth;
        this.plaAttack = playerAttack;
        this.plaSpeed = playerSpeed;
        this.monName = monsterName;
        this.monHealth = monsterHealth;
        this.monAttack = monsterAttack;
        this.monSpeed = monsterSpeed;

    }

    public boolean getCombat() {
        boolean comOver;
        int attackNum = new Random().nextInt(this.plaAttack - 1 + 1) + 1;

        System.out.println("With your attack of "+this.plaAttack+", you hit the " + this.monName + " for " + attackNum + "!");
        monHealth -= attackNum;
        if (monHealth <= 0 ) {
            System.out.println("You defeated the " + this.monName + "!");
            System.out.println("");
            comOver = true;

        } else {
            System.out.println("You did not defeat the " + this.monName + "! The monster's health is now "+ this.monHealth);
            System.out.println("");
            comOver=false;
        }
        return comOver;
    }

    public boolean getRun() {
        boolean runOver;
        int runNum = new Random().nextInt(this.plaSpeed-1+1)+1;
        System.out.println("With your run of 5, you tried running away from the "+ this.monName +" for "+runNum+"!");
        if (runNum >= this.monSpeed) {
            System.out.println("You ran away from the "+ this.monName +"!");
            System.out.println("");
            runOver = true;
        } else {
            System.out.println("You did not run away from the "+ this.monName +"!");
            System.out.println("");
            runOver = false;
        }
        return runOver;
    }

    public void getDefend() {
        int monAttNum = new Random().nextInt(this.monAttack - 1 + 1) + 1;
        int battleDmg = this.plaHealth - monAttNum;
        Player.setPlaHealth(battleDmg);
        System.out.println("The " + this.monName + " attacks you for " + monAttNum + "! Your health is at " + battleDmg + "!");
        System.out.println("");
    }

}
