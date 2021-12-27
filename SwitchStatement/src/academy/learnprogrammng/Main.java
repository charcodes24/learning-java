package academy.learnprogrammng;

public class Main {

    public static void main(String[] args) {
        int value = 6;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value ==2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        //make sure you introduce breaks or else all cases will execute
        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5.");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2.");
                break;
        }

        char testChar = 'F';
        switch(testChar) {
            case 'A':
            case 'E':
            case 'D':
            case 'B':
            case 'C':
                System.out.println("The value is " + testChar);
                break;
            default:
                System.out.println("Char not found");
                break;
        }

        String month = "JANUARY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        printDayOfTheWeek(-6);

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("*********************");

        isPrime(7);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if ((n & i) == 0) {
                return false;
            }
        }

        return true;
    }


    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
