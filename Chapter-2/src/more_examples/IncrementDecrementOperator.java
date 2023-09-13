package more_examples;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int i = 10;
        int newNum = 10 * i++;
        System.out.println("i is " + i + "newNum is : " + newNum);

        i = 10;
        newNum = 10 * (++i);
        System.out.println("i is " + i + "newNum is : " + newNum);

        double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);
        System.out.println("Z is : " + z);

        int j = 1;
        int k = ++j + j * 3; // ?
        System.out.println("K is : " + k);

        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
