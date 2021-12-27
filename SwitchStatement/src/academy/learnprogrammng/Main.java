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
}
