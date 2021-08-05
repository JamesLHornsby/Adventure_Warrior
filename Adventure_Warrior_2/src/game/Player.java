package game;

public class Player {

    private static Player player;
    public int plaHealth;
    public int plaAttack;
    public int plaSpeed;

    public Player() {
        this.plaHealth = 10;
        this.plaAttack = 5;
        this.plaSpeed = 5;
    }
    public static Player getInstance() {
        if (null == player) {
            player = new Player();
        }
        return player;
    }

    public int getPlaHealth() {
        return plaHealth;
    }
    public void setPlaHealth() {
        this.plaHealth = plaHealth;
    }

    public int getPlaAttack() {
        return plaAttack;
    }
    public void setPlaAttack(int plaAttack) {
        this.plaAttack = plaAttack;
    }

    public int getPlaSpeed() {
        return plaSpeed;
    }
    public void setPlaSpeed(int plaSpeed) {
        this.plaSpeed = plaSpeed;
    }

}
