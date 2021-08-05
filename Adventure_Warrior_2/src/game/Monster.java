package game;

import java.util.Random;

public class Monster {
    private static Monster monster;

    public String monName;
    public int monHealth;
    public int monAttack;
    public int monSpeed;

    public Monster() {
        getMonster();
    }

    public void getMonster() {

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
    }

}
