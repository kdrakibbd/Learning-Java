package examples.listing2_7;

public class ShowCurrentTime {
    public static void main(String[] args) {

        long totalMillisSeconds = System.currentTimeMillis();

        long totalSeconds = totalMillisSeconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + " GMT");
    }
}
