package academy.learnprogrammng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue -1));

        int myMaxIntTest = 2_147_483_647; //not common, but valid

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN value = " + myMinByteValue);
        System.out.println("Byte MAXs value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIN value = " + myMinShortValue);
        System.out.println("Short MAXs value = " + myMaxShortValue);
        
        long myLongValue = 100L;//wrong because L needs to be on teh end of it so comp knows
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MIN value = " + myMinLongValue);
        System.out.println("Long MAXs value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);

        byte newByte = 10;
        short newShort = 100;
        int newInt = 10471204;
        int i = newByte + newShort + newInt;
        long newLong = 50000L+ (i * 10L);
        System.out.println(newLong);
    }


}
