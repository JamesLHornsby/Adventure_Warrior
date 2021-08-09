package game;

public class Player {

    private static int plaHealth = 10;
    private static int plaAttack = 2;
    public static int plaSpeed = 5;

/*    public Player() {
        this.plaHealth = 10;
        this.plaAttack = 5;
        this.plaSpeed = 5;
    }*/
/*    public static Player getInstance() {
        if (null == player) {
            player = new Player();
        }
        return player;
    }*/

    public static int getPlaHealth() {
        return plaHealth;
    }
    public static void setPlaHealth(int playerHealth) {
        plaHealth = playerHealth;
    }

    public static int getPlaAttack() {
        return plaAttack;
    }
    public void setPlaAttack(int plaAttack) {
        this.plaAttack = plaAttack;
    }

    public static int getPlaSpeed() {
        return plaSpeed;
    }
    public void setPlaSpeed(int plaSpeed) {
        this.plaSpeed = plaSpeed;
    }

}
