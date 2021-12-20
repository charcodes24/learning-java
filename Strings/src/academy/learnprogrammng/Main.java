package academy.learnprogrammng;

public class Main {

    public static void main(String[] args) {

        //byte *THE LEAST COMMON
        //short *THE LEAST COMMON
        //int *MOST COMMON
        //long
        //float
        //double *MOST COMMON
        //char
        //boolean *MOST COMMON

        String myString = "This is a string";
        System.out.println("My String is = " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95"; //concatenates the strings
        System.out.println("numberString = " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //trying to add int to String > converts value to string and appends
        System.out.println("lastString = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
