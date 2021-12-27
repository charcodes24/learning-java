package academy.learnprogrammng;

public class Main {

    //this whole thing is a method called main
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //define variables, run calculateScore method and then continue with code
       calculateScore(gameOver, score, levelCompleted, bonus);

       score = 10000;
       levelCompleted = 8;
       bonus = 200;
       calculateScore(gameOver, score, levelCompleted, bonus);

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
        //-1 is conventially used to indicate an error or "value not found"
        return -1;
    }
}
