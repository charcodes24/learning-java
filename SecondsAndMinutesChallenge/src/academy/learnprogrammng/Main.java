package academy.learnprogrammng;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(2235, 59));
        System.out.println(getDurationString(78));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds - (minutes * 60);
            return getDurationString(minutes, seconds);
        }

        return "Invalid Value";
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value.");
            return "Invalid value";
        } else {
            int hours = minutes / 60;
            minutes = minutes - (hours * 60);

            String result = hours + " h " + minutes + " m " + seconds + " s ";
            return result;
        }
    }
}
