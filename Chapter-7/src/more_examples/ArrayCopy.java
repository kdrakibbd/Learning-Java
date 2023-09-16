package more_examples;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {1, 2 , 3 , 4 , 5};
        int[] b = new int[10];

        System.arraycopy(a, 0, b, 0, 3);

        for (int i = 0;i < 3;i++)
            System.out.println(b[i]);
    }
}
