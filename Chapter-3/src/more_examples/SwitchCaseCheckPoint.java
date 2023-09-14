package more_examples;

public class SwitchCaseCheckPoint {
    public static void main(String[] args) {

        // 3.13.2
        int x = 3;
        int y = 3;

        switch (x + 3) {
            case 6:
                y = 1;
            default:
                y += 1;
                System.out.println(y);
        }

        // 3.13.4
        
    }
}
