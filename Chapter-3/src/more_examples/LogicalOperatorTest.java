package more_examples;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int i = 1;

        System.out.println((true) && (3 > 4));
        System.out.println(!(i > 0) && (i > 0));
        System.out.println((i > 0) || (i < 0));
        System.out.println((i != 0) || (i == 0));
        System.out.println((i >= 0) || (i < 0));
        System.out.println((i != 1) == !(i == 1));
        System.out.println();

        int a = 10;
        System.out.println(Math.abs(a - 5) > 4.5);
        System.out.println();

        java.util.Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        System.out.println("(x < y && y < z) is " + (x < y && y < z));
        System.out.println("(x < y || y < z) is " + (x < y || y < z));
        System.out.println("!(x < y) is " + !(x < y));
        System.out.println("(x + y < z) is " + (x + y < z));
        System.out.println("(x + y > z) is " + (x + y > z));
    }
}
