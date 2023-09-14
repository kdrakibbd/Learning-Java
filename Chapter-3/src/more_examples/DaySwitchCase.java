package more_examples;

public class DaySwitchCase {
    public static void main(String[] args) {
        int day = 0;

        //fall through behabior
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 0:
            case 6:
                System.out.println("Weekend");
        }
    }
}
