package academy.learnprogrammng;

public class Main {

    //this whole thing is a method called main
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // can assign a variable to a method call
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //define variables, run calculateScore method and then continue with code

       score = 10000;
       levelCompleted = 8;
       bonus = 200;

        // can assign a variable to a method call
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScore(1000);
        displayHighScorePosition("Charlene", highScorePosition);

        highScorePosition = calculateHighScore(900);
        displayHighScorePosition("Teresa", highScorePosition);

        highScorePosition = calculateHighScore(400);
        displayHighScorePosition("Alex", highScorePosition);

        highScorePosition = calculateHighScore(50);
        displayHighScorePosition("Shannon", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //void means you're not returning anything
        //int means your returning an int

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
            //sends finalScore back to wherever you're calling method
            return finalScore;
        }

        //SOMETHING must be returned
        //-1 is conventionally used to indicate an error or "value not found"
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScore(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        //don't need final else
//        return 4;

        int position = 4; // assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}
