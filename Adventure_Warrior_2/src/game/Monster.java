package game;

import java.util.Random;

public class Monster {

    public String monName;
    public int monHealth;
    public int monAttack;
    public int monSpeed;

    public Monster() {
        this.monName = monName;
        this.monHealth = monHealth;
        this.monAttack = monAttack;
        this.monSpeed = monSpeed;
    }

    public void getMonster() {

        int encounterNum = new Random().nextInt(5 - 1 + 1) + 1;

        if (encounterNum == 1) {
            this.monName = "Slime";
            this.monHealth = 1;
            this.monAttack = 1;
            this.monSpeed = 1;
        }
        if (encounterNum == 2) {
            this.monName = "Wolf";
            this.monHealth = 2;
            this.monAttack = 2;
            this.monSpeed = 2;
        }
        if (encounterNum == 3) {
            this.monName = "Goblin";
            this.monHealth = 3;
            this.monAttack = 3;
            this.monSpeed = 3;
        }
        if (encounterNum == 4) {
            this.monName = "Troll";
            this.monHealth = 4;
            this.monAttack = 4;
            this.monSpeed = 4;
        }
        if (encounterNum == 5) {
            this.monName = "Dragon";
            this.monHealth = 5;
            this.monAttack = 5;
            this.monSpeed = 5;
        }
    }

}
