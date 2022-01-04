package academy.learnprogrammng;

//encapsulation allows you to restrict access to certain components
//protect members of class from external/unauthorized access
//stopping classes or code outside of class you're working on from accessing inner workings of class

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        //without a constructor you're not ensuring that fields are populated with necessary values
//        player.fullName = "Charlene";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; // we were able to access fields directly, allowing for unwanted changes
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Charlene", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
