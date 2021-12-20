package academy.learnprogrammng;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN = " + myMinFloatValue);
        System.out.println(("Float MAX = " + myMaxFloatValue));

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double MIN = " + myMinDoubleValue);
        System.out.println(("Double MAX = " + myMaxDoubleValue));

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My Int = " + myIntValue);
        System.out.println("My Float = " + myFloatValue);
        System.out.println("My Double = " + myDoubleValue);

        double pounds = 200d;
        double poundsToKilograms = pounds * 0.45359237d;
        System.out.println(("Conversion =" + poundsToKilograms+"kg"));
    }
}
