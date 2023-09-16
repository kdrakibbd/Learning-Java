package more_examples;

public class CheckPoint5_2_2 {
    public static void main(String[] args) {
        int i = 1;

        // infinite loop
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // infinite loop
        i = 1;
        while (i < 10) {
            if (i % 2 == 1) {
                System.out.println(i++);
            }
        }

        i = 1;
        while (i < 10) {
            if ((i++) % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
