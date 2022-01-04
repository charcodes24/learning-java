package academy.learnprogrammng;

public class Player {

    //any time we change field name we have to make sure to make the changes in every other class we've referenced that field
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
