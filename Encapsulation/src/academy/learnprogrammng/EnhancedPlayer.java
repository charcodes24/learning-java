package academy.learnprogrammng;

//by making fields private we are doing ENCAPSULATION

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        //validation to ensure health has to be between 1-100
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
