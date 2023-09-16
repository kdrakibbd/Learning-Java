package more_examples;

public class Test {
    public static void main(String[] args) {
        //it's correct bt it's bad programming practice
        for (int i = 1; i < 100; System.out.println(i), i++);
        System.out.println("\n\n");

        int sum = 0;
        int i;
        for (i = 0; i < 10; ++i) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(i);

        sum = 0;
        for (i = 0; i < 10; i++) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(i);

        for (int j = 0; j < 5; j++);
        {
            System.out.println("hello");
        }

        int k;
        for (k = 0; k < 10; k++)
            ;
        System.out.println(k + 4);

    }
}
