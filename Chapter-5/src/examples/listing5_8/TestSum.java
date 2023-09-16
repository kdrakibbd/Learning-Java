package examples.listing5_8;

public class TestSum {
    public static void main(String[] args) {
        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
            sum += i;
        }
        System.out.println("Sum is : " + sum);

        sum = 0;
        for (double i = 0.01f; i <= 1.0f; i += 0.01f) {
            sum += i;
        }
        System.out.println("Sum is : "+sum);
    }
}
